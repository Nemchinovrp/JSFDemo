package my.web.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public String URL = "jdbc:mysql://mysql37.hostland.ru:3306/host1378713";
    public String login = "host1378713";
    public String password = "265f61ab";

    Connection connection;

    public  Connection getConnection() {
        return connection;
    }

    public Database(){

        try{
            connection = DriverManager.getConnection(URL, login, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
