package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    static Connection connection;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/filehiderproject?useSSL=false",
                    "root",
                    "Arghya2003@"
            );
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("connection done ");
        return connection;  // Ensure connection is returned
    }
    public static void connectionClose(){
        if( connection != null){
            try{
                connection.close();
            }catch(SQLException ex){
                throw new RuntimeException(ex);
            }
        }
    }


}

