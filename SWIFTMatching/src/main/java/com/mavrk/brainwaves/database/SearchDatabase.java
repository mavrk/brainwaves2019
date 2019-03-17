/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavrk.brainwaves.database;

import com.mavrk.brainwaves.MT300view;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sanatt Abrol
 */
public class SearchDatabase {
    //this class searches db from input params

    public List<String> getSearchQueryAsString(Date tradeFrom, Date tradeTo, Date settlementFrom, Date settlementTo, String buyCurrency, String sellCurrency,
            Double buyAmtStart, Double buyAmtEnd, Double sellAmtStart, Double sellAmtEnd, Double rateStart, Double rateEnd, String counterpart,
            String reference, Boolean[] checks, Integer statusNumber) {

            List<String> list = new ArrayList();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (checks[10]) {
                String query = "SELECT * from deals_from_txt where ";
                
                if(checks[5]) {
                    query += "(`STATUS` = '" + statusNumber + "') AND ";
                }
                if (checks[0]) {
                    query += "(`:30T` BETWEEN '" + sdf.format(tradeFrom) + "' AND '" + sdf.format(tradeTo) + "') AND ";
                }
                if (checks[1]) {
                    query += "(`:30V` BETWEEN '" + sdf.format(settlementFrom) + "' AND '" + sdf.format(settlementTo) + "') AND ";
                }
                if (checks[2]) {
                    query += "(`:32B` like '" + buyCurrency + "%') AND ";
                }
                if (checks[3]) {
                    query += "(`:33B` like '" + sellCurrency + "%') AND ";
                }
                if (checks[7]) {
                    query += "(`BUY_AMT` BETWEEN '" + buyAmtStart + "' AND '" + buyAmtEnd + "') AND ";
                }
                if (checks[8]) {
                    query += "(`SELL_AMT` BETWEEN '" + sellAmtStart + "' AND '" + sellAmtEnd + "') AND ";
                }
                if (checks[6]) {
                    query += "(`:36` BETWEEN '" + rateStart + "' AND '" + rateEnd + "') AND ";
                }
                if (checks[4]) {
                    query += "(`:82A` like '%" + counterpart + "%') AND ";
                }
                if (checks[9]) {
                    query += "(`:20` like '%" + reference + "%') AND ";
                }

                query = query.substring(0, query.length() - 5);
                query = query + ";";
                System.out.println(query);
                list.add(query);
            }
            if (checks[11]) {
                String query = "SELECT * from deals_from_txt_client where ";

                if(checks[5]) {
                    query += "(`STATUS` = '" + statusNumber + "') AND ";
                }
                if (checks[0]) {
                    query += "(`:30T` BETWEEN '" + sdf.format(tradeFrom) + "' AND '" + sdf.format(tradeTo) + "') AND ";
                }
                if (checks[1]) {
                    query += "(`:30V` BETWEEN '" + sdf.format(settlementFrom) + "' AND '" + sdf.format(settlementTo) + "') AND ";
                }
                if (checks[2]) {
                    query += "(`:32B` like '" + buyCurrency + "%') AND ";
                }
                if (checks[3]) {
                    query += "(`:33B` like '" + sellCurrency + "%') AND ";
                }
                if (checks[7]) {
                    query += "(`BUY_AMT` BETWEEN '" + buyAmtStart + "' AND '" + buyAmtEnd + "') AND ";
                }
                if (checks[8]) {
                    query += "(`SELL_AMT` BETWEEN '" + sellAmtStart + "' AND '" + sellAmtEnd + "') AND ";
                }
                if (checks[6]) {
                    query += "(`:36` BETWEEN '" + rateStart + "' AND '" + rateEnd + "') AND ";
                }
                if (checks[4]) {
                    query += "(`:82A` like '%" + counterpart + "%') AND ";
                }
                if (checks[9]) {
                    query += "(`:20` like '%" + reference + "%') AND ";
                }

                query = query.substring(0, query.length() - 5);
                query = query + ";";
                System.out.println(query);
                list.add(query);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
    public List<MT300view> executeAndReturnList(String query){
        List<MT300view> list = new ArrayList<>();
        try {
            Connection conn = ConnectionHelper.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                MT300view mt = new MT300view(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), ""+rs.getDate(5), ""+rs.getDate(6)
                        , rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), 
                        rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getDouble(19), rs.getDouble(20),
                rs.getInt(21));
                
                list.add(mt);
            }
            conn.close();
            stm.close();
        } catch(Exception e){
        e.printStackTrace();
        }
        return list;
    }
    
    
    public void autoMatchDealsSG(){
        try {
            Connection con = ConnectionHelper.getConnection();
            Statement stm = con.createStatement();
            String query = "SELECT DISTINCT `deals_from_txt`.`:20`, `deals_from_txt_client`.`:20` from `deals_from_txt_client` , `deals_from_txt`  WHERE (`deals_from_txt`.`:82A` = `deals_from_txt_client`.`:87A`) AND (`deals_from_txt`.`:87A`= `deals_from_txt_client`.`:82A`) AND (`deals_from_txt`.`:77H`=`deals_from_txt_client`.`:77H`) AND (`deals_from_txt`.`:30T` = `deals_from_txt_client`.`:30T`) AND (`deals_from_txt`.`:30V` = `deals_from_txt_client`.`:30V`) AND (`deals_from_txt`.`:36`=`deals_from_txt_client`.`:36`) AND (`deals_from_txt`.`:32B`=`deals_from_txt_client`.`:33B`) AND (`deals_from_txt`.`:33B`=`deals_from_txt_client`.`:32B`)";
            ResultSet rs = stm.executeQuery(query);
            List<String> sgItems = new ArrayList();
            List<String> clientItems = new ArrayList();
            while(rs.next()){
                sgItems.add(rs.getString(1));
                clientItems.add(rs.getString(2));
            }
            String query2 = "UPDATE deals_from_txt SET STATUS = 3 WHERE `:20` IN ( ";
            for(String s : sgItems){
                query2 += "'" +  s + "',";
            }
            query2 = query2.substring(0,query2.length() - 1);
            query2 += " );";
            System.out.println(query2);
            stm = con.createStatement();
            stm.execute(query2);
            
            for(int i = 0; i < sgItems.size(); i++){
                query = "INSERT INTO auto_matched_deals (`SG:20`, `Client:20`) VALUES ('" + sgItems.get(0) + "','" +clientItems.get(0) + "');";
                stm = con.createStatement();
                stm.execute(query);
            }
            
        } catch (Exception e){
        
        }
    }
    
    public void autoMatchDealsClient(){
        try {
            Connection con = ConnectionHelper.getConnection();
            Statement stm = con.createStatement();
            String query = "SELECT DISTINCT `deals_from_txt_client`.`:20` from `deals_from_txt_client` , `deals_from_txt`  WHERE (`deals_from_txt`.`:82A` = `deals_from_txt_client`.`:87A`) AND (`deals_from_txt`.`:87A`= `deals_from_txt_client`.`:82A`) AND (`deals_from_txt`.`:77H`=`deals_from_txt_client`.`:77H`) AND (`deals_from_txt`.`:30T` = `deals_from_txt_client`.`:30T`) AND (`deals_from_txt`.`:30V` = `deals_from_txt_client`.`:30V`) AND (`deals_from_txt`.`:36`=`deals_from_txt_client`.`:36`) AND (`deals_from_txt`.`:32B`=`deals_from_txt_client`.`:33B`) AND (`deals_from_txt`.`:33B`=`deals_from_txt_client`.`:32B`)";
            ResultSet rs = stm.executeQuery(query);
            List<String> sgItems = new ArrayList();
            while(rs.next()){
                sgItems.add(rs.getString(1));
            }
            String query2 = "UPDATE deals_from_txt_client SET STATUS = 3 WHERE `:20` IN ( ";
            for(String s : sgItems){
                query2 += "'" +  s + "',";
            }
            query2 = query2.substring(0,query2.length() - 1);
            query2 += " );";
            System.out.println(query2);
            stm = con.createStatement();
            stm.execute(query2);
            con.close();
        } catch (Exception e){
        
        }
    }
    
    public void generateMisMatch(){
        try {
            Connection con = ConnectionHelper.getConnection();
            Statement stm = con.createStatement();
            String query = "INSERT INTO `mismatched_deals`(`SG:20`, `Client:20`) SELECT s.`:20`, c.`:20` from deals_from_txt_client as c, deals_from_txt as s WHERE ((s.`:82A`  =c.`:87A`) AND (s.`:87A` = c.`:82A`) AND (s.`:77H` = c.`:77H`) AND (s.`:30T` = c.`:30T`) AND (s.`:30V` = c.`:30V`) AND (s.`:36` != c.`:36`) AND (s.`:32B` = c.`:33B`) AND (s.`:33B` != c.`:32B`))";
            stm.execute(query);
            query = "INSERT INTO `mismatched_deals`(`SG:20`, `Client:20`) SELECT s.`:20`, c.`:20` from deals_from_txt_client as c, deals_from_txt as s WHERE ((s.`:82A`  =c.`:87A`) AND (s.`:87A` = c.`:82A`) AND (s.`:77H` = c.`:77H`) AND (s.`:30T` = c.`:30T`) AND (s.`:30V` = c.`:30V`) AND (s.`:36` =c.`:36`) AND (s.`:32B` != c.`:33B`) AND (s.`:33B` != c.`:32B`))";
            stm = con.createStatement();
            stm.execute(query);
            stm = con.createStatement();
            query = "INSERT INTO `mismatched_deals`(`SG:20`, `Client:20`) SELECT c.`:20`, s.`:20` from deals_from_txt_client as c, deals_from_txt as s WHERE ((s.`:82A` =c.`:87A`) AND (s.`:87A` = c.`:82A`) AND (s.`:77H` = c.`:77H`) AND (s.`:30T` = c.`:30T`) AND (s.`:30V` != c.`:30V`) AND (s.`:36` = c.`:36`))";
            stm.execute(query);
        } catch (Exception e){
        
        }
    }
    
    public List<String> getMisMatchedClients(String sg20){
        List<String> list = new ArrayList();
        try {
            Connection con = ConnectionHelper.getConnection();
            Statement stm = con.createStatement();
            String query = "SELECT `Client:20` from mismatched_deals WHERE `SG:20`='" + sg20 + "'";
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()){
                list.add(rs.getString(1));
            }
        } catch (Exception e){
        
        }
        return list;
    }
    
    public MT300view getMTView(boolean isSg, String field20){
        try {
            Connection con = ConnectionHelper.getConnection();
            Statement stm = con.createStatement();
            String query = "SELECT * from deals_from_txt" + (isSg ? "" : "_client ") + " WHERE `:20` = '" + field20 + "';";
            System.out.println(query);
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                MT300view mt = new MT300view(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), ""+rs.getDate(5), ""+rs.getDate(6)
                        , rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), 
                        rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getDouble(19), rs.getDouble(20),
                rs.getInt(21));
                
                return mt;
            }
        } catch (Exception e){
        
        }
        return null;
    }
    
    public void updateStatusOfMismatch(){
        try {
            Connection con = ConnectionHelper.getConnection();
            Connection con2 = ConnectionHelper.getConnection();
            Statement stm2 = con2.createStatement();
            Statement stm = con.createStatement();
            String query = "SELECT `SG:20` from mismatched_deals";
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                String query2 = "UPDATE deals_from_txt SET STATUS = '2' WHERE `:20` = '" + rs.getString(1) + "';";
                stm2.execute(query2);
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void sendForReview(String sg20, String client20, String comments){
        try {
            Connection con = ConnectionHelper.getConnection();
            Statement stm = con.createStatement();
            String query = "INSERT into underreview_deals (`SG:20`, `Client:20`, `Comments`) VALUES ('%s', '%s', '%s');";
            query = String.format(query, sg20, client20, comments);
            stm.execute(query);
            System.out.println(query);
            stm.close();
            con.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Object[]> getReviewItems(){
        try {
            Connection con = ConnectionHelper.getConnection();
            Statement stm = con.createStatement();
            String query = "SELECT * from underreview_deals;";
            ResultSet rs = stm.executeQuery(query);
            List<Object[]> list = new ArrayList();
            while(rs.next()){
                Object[] objArr = new Object[4];
                objArr[0] = rs.getString(1);
                objArr[1] = rs.getString(2);
                objArr[2] = rs.getString(3);
                objArr[3] = rs.getDate(4);
                list.add(objArr);
            }
            stm.close();
            con.close();
            return list;
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return null;
    }
}
