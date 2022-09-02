package com.example.AppWebHouseCenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class Empresa {

    @Id
    private String nitEmpresa;
    @Column(name = "nombreEmpresa", length = 50, nullable = false)
    private String nombreEmpresa;
    @Column(name = "direccionEmpresa", length = 50, nullable = false)
    private String direccionEmpresa;
    @Column(name = "telefonoEmpresa", length = 30, nullable = false)
    private String telefonoEmpresa;


    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa){
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public Empresa() {
    }

    public String getNombreEmpresa() {

        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {

        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {

        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {

        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {

        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {

        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {

        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {

        this.nitEmpresa = nitEmpresa;
    }
}
