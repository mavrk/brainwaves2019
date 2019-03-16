/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavrk.brainwaves.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sanatt Abrol
 */
public class AmountAssigner {
    static Connection connection;
    static Statement statement;
    static ResultSet resultSet;
    
    public static void main(String[] args) {
        try{
            connection = ConnectionHelper.getConnection();
            statement = connection.createStatement();
            String query = "SELECT SUBSTRING_INDEX(SUBSTRING_INDEX(`:32B`, ' ', 2), ' ', -1) as BUY_AMT from sg_sample_data";
            resultSet = statement.executeQuery(query);
            ArrayList<Integer> buyList = new ArrayList<Integer>();
            while(resultSet.next()){
                buyList.add(resultSet.getInt(1));
            }
            resultSet.close();
            statement.close();
            connection.close();
            
        } catch(Exception ex){
            
        }
        
        try {
            connection = ConnectionHelper.getConnection();
            statement = connection.createStatement();
            String query = "INSERT INTO SUBSTRING_INDEX(SUBSTRING_INDEX(`:32B`, ' ', 2), ' ', -1) as BUY_AMT from sg_sample_data";
            resultSet = statement.executeQuery(query);
            ArrayList<Integer> buyList = new ArrayList<Integer>();
            while(resultSet.next()){
                buyList.add(resultSet.getInt(1));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e){
            
        }
    }
}
