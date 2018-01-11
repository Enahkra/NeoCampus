/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neocampus;
import java.util.ArrayList;

import java.util.List;

import java.util.ListIterator;
/**
 *
 * @author moussabrahim
 */
public class FilDeDiscussion {
    
    private int idFilDeDiscussion;
    private String titre ;
   List listeMessage = new ArrayList() ;
   
   public FilDeDiscussion (int idFilDiscussion, String titreF, String message )
   {
       idFilDeDiscussion = idFilDiscussion;
       titre = titreF ;
       listeMessage.add(message);
       
       
   }
    
    
}
