/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author einstein pc
 */
@Entity
@Table(name = "CORREOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correos.findAll", query = "SELECT c FROM Correos c"),
    @NamedQuery(name = "Correos.findByCorreoId", query = "SELECT c FROM Correos c WHERE c.correoId = :correoId"),
    @NamedQuery(name = "Correos.findByCorreo", query = "SELECT c FROM Correos c WHERE c.correo = :correo"),
    @NamedQuery(name = "Correos.findByEstado", query = "SELECT c FROM Correos c WHERE c.estado = :estado")})
public class Correos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CORREO_ID")
    private Integer correoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CORREO")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "PERSONA_ID", referencedColumnName = "PERSONA_ID")
    @ManyToOne
    private Personas personaId;

    public Correos() {
    }

    public Correos(Integer correoId) {
        this.correoId = correoId;
    }

    public Correos(Integer correoId, String correo, String estado) {
        this.correoId = correoId;
        this.correo = correo;
        this.estado = estado;
    }

    public Integer getCorreoId() {
        return correoId;
    }

    public void setCorreoId(Integer correoId) {
        this.correoId = correoId;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Personas getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Personas personaId) {
        this.personaId = personaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (correoId != null ? correoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correos)) {
            return false;
        }
        Correos other = (Correos) object;
        if ((this.correoId == null && other.correoId != null) || (this.correoId != null && !this.correoId.equals(other.correoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Correos[ correoId=" + correoId + " ]";
    }
    
}
