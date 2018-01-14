/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neocampus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Samuel
 */
public class Run {
    public static void main(String[] args) throws SQLException {
        Connection conn = database.Connect.lC();
        //L'objet ResultSet contient le résultat de la requête SQL
        try ( //Création d'un objet Statement
                Statement state = conn.createStatement(); //L'objet ResultSet contient le résultat de la requête SQL
                ResultSet result = state.executeQuery("SELECT * FROM threads")) {
            //On récupère les MetaData
            ResultSetMetaData resultMeta = result.getMetaData();
            
            System.out.println("\n**********************************");
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
            
            System.out.println("\n**********************************");
            
            while(result.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                    System.out.print("\t" + result.getObject(i).toString() + "\t |");
                
                System.out.println("\n---------------------------------");
                
            }
            
        }
        interfaceGraphique.NewJFrame.lI();
        //interfaceGraphique.NewJFrame.jList1ComponentAdded();
    }
}