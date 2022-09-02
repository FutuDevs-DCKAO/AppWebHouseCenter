package com.example.AppWebHouseCenter.entities;

import javax.persistence.Entity;

@Entity
public class Empresa {
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private double nitEmpresa;


    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, double nitEmpresa){
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

    public double getNitEmpresa() {

        return nitEmpresa;
    }

    public void setNitEmpresa(double nitEmpresa) {

        this.nitEmpresa = nitEmpresa;
    }
}
