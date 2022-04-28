package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class QueryModel {
    Connection conn;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    public QueryModel(){
        try {
            conn = DBconnection.getMSSQLConnection();
            System.out.println("Connection:"+conn);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public ResultSet searchEmployee(String firstname, String lastname){
        try{
            String query = String.format("SELECT * FROM employees.employees WHERE first_name LIKE '%s' AND last_name LIKE '%s' ", firstname, lastname);
            System.out.println(query);
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet;
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public String checkPassword (String username){
        try {
            String query = String.format("SELECT * FROM employees.useraccount WHERE username ='%s' ",username);
            preparedStatement = conn.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                return resultSet.getString("password");
            }else{
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
