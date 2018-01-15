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
public class FilDeDiscussion implements Utilisateur , Serveur {
    
    private int idFilDeDiscussion;
    private int idGroupe;
    private String titre ;
   List listeMessage = new ArrayList() ;
   
   /*public FilDeDiscussion (int idFilDiscussion, String titreF, String message )
   {
       idFilDeDiscussion = idFilDiscussion;
       titre = titreF ;
       listeMessage.add(message);
       
       
   }*/

    public FilDeDiscussion(int idFilDeDiscussion, String titre) {
        this.idFilDeDiscussion = idFilDeDiscussion;
        this.titre = titre;
    }

    public int getIdFilDeDiscussion() {
        return idFilDeDiscussion;
    }

    public String getTitre() {
        return titre;
    }

    public List getListeMessage() {
        return listeMessage;
    }

    public void setIdFilDeDiscussion(int idFilDeDiscussion) {
        this.idFilDeDiscussion = idFilDeDiscussion;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setListeMessage(List listeMessage) {
        this.listeMessage = listeMessage;
    }
    
    public void creerTicket ()
    {
        
    }
   
    public void ecrireMessage ()
    {
        
    }
    
    public void ajouerUtilisateur()
    {
        
    }
    public void modifierUtilisateur()
    {
        
    }
    public void supprimerUtilisateur ()
    {
        
    }
    public void ajouterGroupe()
    {
        
    }
    public void modifierGroupe()
    {
        
    }
    public void supprimerGroupe()
    {
        
    }
    public void gererAdhesion()
    {
        
    }
   
  
    
    
    
}