/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "vehiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehiculo.findAll", query = "SELECT v FROM Vehiculo v")
    , @NamedQuery(name = "Vehiculo.findByIdVehiculo", query = "SELECT v FROM Vehiculo v WHERE v.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Vehiculo.findByA\u00f1o", query = "SELECT v FROM Vehiculo v WHERE v.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Vehiculo.findByNumPasajeros", query = "SELECT v FROM Vehiculo v WHERE v.numPasajeros = :numPasajeros")
    , @NamedQuery(name = "Vehiculo.findByModelo", query = "SELECT v FROM Vehiculo v WHERE v.modelo = :modelo")
    , @NamedQuery(name = "Vehiculo.findByMarca", query = "SELECT v FROM Vehiculo v WHERE v.marca = :marca")
    , @NamedQuery(name = "Vehiculo.findByCilindraje", query = "SELECT v FROM Vehiculo v WHERE v.cilindraje = :cilindraje")
    , @NamedQuery(name = "Vehiculo.findByPaisFrabrica", query = "SELECT v FROM Vehiculo v WHERE v.paisFrabrica = :paisFrabrica")
    , @NamedQuery(name = "Vehiculo.findByPlaca", query = "SELECT v FROM Vehiculo v WHERE v.placa = :placa")
    , @NamedQuery(name = "Vehiculo.findByConcesionarioVenta", query = "SELECT v FROM Vehiculo v WHERE v.concesionarioVenta = :concesionarioVenta")})
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "idVehiculo")
    private String idVehiculo;
    @Size(max = 20)
    @Column(name = "a\u00f1o")
    private String año;
    @Size(max = 60)
    @Column(name = "num_pasajeros")
    private String numPasajeros;
    @Size(max = 45)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 45)
    @Column(name = "marca")
    private String marca;
    @Size(max = 20)
    @Column(name = "cilindraje")
    private String cilindraje;
    @Size(max = 45)
    @Column(name = "paisFrabrica")
    private String paisFrabrica;
    @Size(max = 45)
    @Column(name = "placa")
    private String placa;
    @Size(max = 45)
    @Column(name = "concesionarioVenta")
    private String concesionarioVenta;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(String numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPaisFrabrica() {
        return paisFrabrica;
    }

    public void setPaisFrabrica(String paisFrabrica) {
        this.paisFrabrica = paisFrabrica;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getConcesionarioVenta() {
        return concesionarioVenta;
    }

    public void setConcesionarioVenta(String concesionarioVenta) {
        this.concesionarioVenta = concesionarioVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVehiculo != null ? idVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.idVehiculo == null && other.idVehiculo != null) || (this.idVehiculo != null && !this.idVehiculo.equals(other.idVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Vehiculo[ idVehiculo=" + idVehiculo + " ]";
    }
    
}
