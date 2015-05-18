package com.epam.khalii.WordGame.Parse;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Skopa on 16.05.2015.
 */
public class SQLParse {
    public static final String SQL_GET_ALL_CITIES = "select city_name from cities";

    public ArrayList<String> getAll() throws SQLException {
        ArrayList<String> cities = new ArrayList<String>();
        Connection cn = null;
        Statement st = null;
        try {
            cn = DBConnector.getConnection();
            st = cn.createStatement();
            ResultSet resultSet = st.executeQuery(SQL_GET_ALL_CITIES);
            while (resultSet.next()) {
                String city = resultSet.getString(1);
                cities.add(city);
                System.out.println(city);
            }
            return cities;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return cities;
    }
}

class DBConnector {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost/wordgame";
        String name = "root";
        String password = "";
        Connection cn = DriverManager.getConnection(url, name, password);
        return cn;
    }
}