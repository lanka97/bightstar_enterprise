/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;




public class DBConnect {
    public static Connection connect(){
        
        Connection conn =null;
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/brightstar?autoReconnect=true&useSSL=false","root", "root");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return conn;
        
    }

       
    

    

  
}
  


   