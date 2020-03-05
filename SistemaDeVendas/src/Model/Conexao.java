package Model;

import java.sql.*;

public class Conexao {

    public static Connection conectar() {

        try {
            //class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_sistemadevendas?zeroDateTimeBehavior=convertToNull [root em Esquema default]";
            Connection conn = DriverManager.getConnection(url, "root", "");
            return conn;
        } catch (SQLException e) {
            // do something appropriate with the exception, *at least*:
            return null;
        }
    }

}
