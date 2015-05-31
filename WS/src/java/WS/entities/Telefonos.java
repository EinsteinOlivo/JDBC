/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WS.entities;

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
@Table(name = "TELEFONOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefonos.findAll", query = "SELECT t FROM Telefonos t"),
    @NamedQuery(name = "Telefonos.findByTelefonoId", query = "SELECT t FROM Telefonos t WHERE t.telefonoId = :telefonoId"),
    @NamedQuery(name = "Telefonos.findByTelefono", query = "SELECT t FROM Telefonos t WHERE t.telefono = :telefono"),
    @NamedQuery(name = "Telefonos.findByEstado", query = "SELECT t FROM Telefonos t WHERE t.estado = :estado")})
public class Telefonos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO_ID")
    private Integer telefonoId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "PERSONA_ID", referencedColumnName = "PERSONA_ID")
    @ManyToOne
    private Personas personaId;

    public Telefonos() {
    }

    public Telefonos(Integer telefonoId) {
        this.telefonoId = telefonoId;
    }

    public Telefonos(Integer telefonoId, String telefono, String estado) {
        this.telefonoId = telefonoId;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Integer getTelefonoId() {
        return telefonoId;
    }

    public void setTelefonoId(Integer telefonoId) {
        this.telefonoId = telefonoId;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (telefonoId != null ? telefonoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefonos)) {
            return false;
        }
        Telefonos other = (Telefonos) object;
        if ((this.telefonoId == null && other.telefonoId != null) || (this.telefonoId != null && !this.telefonoId.equals(other.telefonoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WS.entities.Telefonos[ telefonoId=" + telefonoId + " ]";
    }
    
}
