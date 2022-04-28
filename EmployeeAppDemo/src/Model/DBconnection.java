package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    //Use for connect to Database
    public static Connection getMSSQLConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String host = "202.44.9.117";
            String databaseName = "105Exam";
            String user = "db62130500214";
            String password = "ZnhX4947";
            String url = String.format("jdbc:sqlserver://%s;databaseName=%s;user=%s;password=%s",host,databaseName,user,password);
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}