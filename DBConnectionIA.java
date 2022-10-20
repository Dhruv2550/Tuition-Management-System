import java.sql.*;

public class DBConnectionIA {
    Connection con = null;
    
    public static Connection ConnectionDB(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:studentdataDB.db");
            System.out.println("DB Connection Succeeded");
            return con;
        }
        
        catch(Exception e){
            System.out.println("DB Connection Failed" + e);
            return null;
        }
    }
    
}