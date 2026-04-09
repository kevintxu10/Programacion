package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDataBaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/tareas_db";
    private static final String USER = "developer";
    private static final String PASS = "developer"; // <-- CAMBIA ESTO

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }



}
