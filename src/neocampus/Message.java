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
public class Message {
    int idMessage;
    String contenuMessage;
    int dateMessage;

    public Message(int idMessage, String contenuMessage, int dateMessage) {
        this.idMessage = idMessage;
        this.contenuMessage = contenuMessage;
        this.dateMessage = dateMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public void setContenuMessage(String contenuMessage) {
        this.contenuMessage = contenuMessage;
    }

    public void setDateMessage(int dateMessage) {
        this.dateMessage = dateMessage;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public String getContenuMessage() {
        return contenuMessage;
    }

    public int getDateMessage() {
        return dateMessage;
    }
}
