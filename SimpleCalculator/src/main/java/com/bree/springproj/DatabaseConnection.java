package com.bree.springproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DatabaseConnection{

    private Connection conn;

    private PreparedStatement preparedStatement;

    public void connection () throws Exception{

        Class.forName("org.mariadb.jdbc.Driver");
        String url = "jdbc:mariadb://127.0.0.1:3306/jdbcConnection";
        String username = "bree";
        String password = "bree004!!";

        this.conn = DriverManager.getConnection(url,username,password);
        System.out.println("Connection created..>>>");
        System.out.println(conn);
    }

    public  void insertion(double num1, double num2,String operation, double result) throws Exception{

        String query = "insert into information values(?,?,?,?)";

        System.out.println(conn);

        preparedStatement = conn.prepareStatement(query);

        preparedStatement.setDouble(1, num1);
        preparedStatement.setDouble(2, num2);
        preparedStatement.setString(3, operation);
        preparedStatement.setDouble(4,result);
        preparedStatement.executeQuery();

    }





}
