package com.example.AppWebHouseCenter.entities;

import javax.persistence.Entity;

@Entity
public class Empleado {

    private String nombre, correo;
    private Empresa empresaPertenciente;
    private String rol;

    public Empleado(String nombre, String correo, Empresa empresaPertenciente, String rol){
        this.nombre = nombre;
        this.correo = correo;
        this.empresaPertenciente = empresaPertenciente;
        this.rol = rol;

    }

    public Empleado(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresaPertenciente() {
        return empresaPertenciente;
    }

    public void setEmpresaPertenciente(Empresa empresaPertenciente) {
        this.empresaPertenciente = empresaPertenciente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
