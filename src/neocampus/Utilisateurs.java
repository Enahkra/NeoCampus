/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neocampus;

/**
 *
 * @author moussabrahim
 */
abstract class Utilisateurs implements Utilisateur {
     int idUtilisateur;
     String motDePasse ;
     String nom;
     String prenom ;
     String typeUtilisateur ; 
    
     public Utilisateurs(int idUtilisateur, String motDePasse, String nom, String prenom, String typeUtilisateur) {
        this.idUtilisateur = idUtilisateur;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.typeUtilisateur = typeUtilisateur;
    }
     
     public void creerTicket () {
         
     }
    public void ecrireMessage (){
        
    }
    
}