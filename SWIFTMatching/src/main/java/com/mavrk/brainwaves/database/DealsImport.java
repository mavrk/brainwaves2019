/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavrk.brainwaves.database;

import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.mt.mt3xx.MT300;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sanatt Abrol
 */
public class DealsImport {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public DealsImport() {
        connection = null;
        statement = null;
        resultSet = null;
    }
    

    public void addDealToDatabase(MT300 deal) {
        connection = null;
        String query = "INSERT into deals_from_txt values ('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s', '%s','%s','%s');";
        String field32B = "", field33B = "", field56A = "", field53A = "";
        
        try {
            field32B = deal.getField32B().get(0).getValue();
        } catch(Exception e){
            
        }
        try {
            field33B = deal.getField33B().getValue();
        } catch(Exception e){}
        
        try {
            field56A = deal.getField56A().get(0).getValue();
        } catch(Exception e){}
        
        query = String.format(query, deal.getField20().getValue(), 
                deal.getField22A().getValue(), 
                deal.getField22C().getValue(), 
                "", 
                deal.getField30T().getValue(), 
                deal.getField30V().getValue(), 
                field32B, 
                field33B,
                deal.getField36().getValue(), 
                "", 
                "", 
                field56A, 
                deal.getField57A().get(0).getValue(), 
                deal.getField57D().get(0).getValue(), 
                deal.getField58A().get(0).getValue(),
                deal.getField77H().getValue(), 
                deal.getField82A().getValue(), 
                deal.getField87A().getValue());
        try {
            System.out.println(query);
            connection = ConnectionHelper.getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionHelper.close(connection);
        }
    }

}
