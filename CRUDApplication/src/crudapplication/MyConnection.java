package crudapplication;

import java.sql.*;

public class MyConnection {
    public static Connection connect() {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/dbms?user=root&password=");
        }
        catch(Exception e){
            System.out.println(e);
	}
        return con;
    }
    
}
