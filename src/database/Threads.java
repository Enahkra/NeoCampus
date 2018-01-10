/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Samuel
 */
@Entity
@Table(name = "threads")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Threads.findAll", query = "SELECT t FROM Threads t")
    , @NamedQuery(name = "Threads.findByThreadId", query = "SELECT t FROM Threads t WHERE t.threadId = :threadId")
    , @NamedQuery(name = "Threads.findByThreadTitle", query = "SELECT t FROM Threads t WHERE t.threadTitle = :threadTitle")})
public class Threads implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "thread_id")
    private Integer threadId;
    @Basic(optional = false)
    @Column(name = "thread_title")
    private String threadTitle;

    public Threads() {
    }

    public Threads(Integer threadId) {
        this.threadId = threadId;
    }

    public Threads(Integer threadId, String threadTitle) {
        this.threadId = threadId;
        this.threadTitle = threadTitle;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public String getThreadTitle() {
        return threadTitle;
    }

    public void setThreadTitle(String threadTitle) {
        this.threadTitle = threadTitle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (threadId != null ? threadId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Threads)) {
            return false;
        }
        Threads other = (Threads) object;
        if ((this.threadId == null && other.threadId != null) || (this.threadId != null && !this.threadId.equals(other.threadId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "database.Threads[ threadId=" + threadId + " ]";
    }
    
}
