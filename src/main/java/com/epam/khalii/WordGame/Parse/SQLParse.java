package com.epam.khalii.WordGame.Parse;

import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Created by Skopa on 16.05.2015.
 */
public class SQLParse {
    public static final String SQL_GET_ALL_CITIES = "select city_name from cities";

    public ArrayList<String> getAll() throws SQLException{
        ArrayList<String> cities = new ArrayList<String>();
        Connection cn = null;
        Statement st = null;
        cn = DBConnector.getConnection();
        st = cn.createStatement();
        ResultSet resultSet = st.executeQuery(SQL_GET_ALL_CITIES);
        while(resultSet.next()){
            String town = resultSet.getString(1);
            cities.add(town);
        }
        return cities;
    }
}

class DBConnector{
    public static Connection getConnection() throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("database");
        String url= resource.getString("db.url");
        String user=resource.getString("db.user");
        String pass=resource.getString("db.password");
        return DriverManager.getConnection(url, user, pass);
    }
}