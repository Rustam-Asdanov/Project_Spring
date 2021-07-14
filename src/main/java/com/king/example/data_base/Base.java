package com.king.example.data_base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Base {
    private static final String URL = "jdbc:mysql://localhost:3307/springnews";
    private static final String LOGIN = "mysql";
    private static final String PASSWORD = "mysql";
    private static Connection conn;
    private static Statement statement;

    static {
        try {
            conn = DriverManager.getConnection(URL,LOGIN, PASSWORD);
            statement = conn.createStatement();
        } catch (SQLException throwables) {
            System.out.println("We have problem with Data Base");
        }
    }

    public static void getData(){

    }

}
