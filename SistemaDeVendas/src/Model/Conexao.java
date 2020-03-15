package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    /*private Connection conn;
    private Statement st;
    private ResultSet rs;*/

    //public static Connection conectar() {
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sistemadevendas","root","");  
            System.out.println("Connected");
            return conn;
        }
        catch(Exception ex) {
            System.out.println("Error: "+ex);
            System.out.println("Not Connected");
            return null;
        }
    }
}
