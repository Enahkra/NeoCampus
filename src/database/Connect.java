/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


/**
 *
 * @author Samuel
 */
public class Connect {
    public static Connection lC() {   
    try {
      Class.forName("org.postgresql.Driver");
      System.out.println("Driver O.K.");

      String url = "jdbc:postgresql://localhost:5432/NeoCampus";
      String user = "postgres";
      String passwd = "postgres";

      Connection conn = DriverManager.getConnection(url, user, passwd);
      System.out.println("Connexion effective !");
      return conn;
   } catch (Exception e) {
      e.printStackTrace();
    }      
        return null;
    
  }
}
