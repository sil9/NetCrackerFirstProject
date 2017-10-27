package com.netcracker.selyutin;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/courses?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private ConnectionDB() {

    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private static class Holder {
        private final static ConnectionDB INSTANCE = new ConnectionDB();
    }

    public static ConnectionDB getInstance() {
        return Holder.INSTANCE;
    }
}
