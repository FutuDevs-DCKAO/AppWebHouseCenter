package com.example.AppWebHouseCenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empresas")
public class Empresa {

    @Id
    private String nitEmpresa;
    @Column(name = "nombre_Empresa", length = 50)
    private String nombreEmpresa;
    @Column(name = "direccion_Empresa", length = 50)
    private String direccionEmpresa;
    @Column(name = "telefono_Empresa")
    private String telefonoEmpresa;


    public Empresa(String nitEmpresa, String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa) {
        this.nitEmpresa = nitEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Empresa() {
    }

    public String getNitEmpresa() {

        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {

        this.nitEmpresa = nitEmpresa;
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


}
