package com.example.AppWebHouseCenter.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table
public class Empleado {

    @Id
    private String documento;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;
    @Column(name = "rol", nullable = false, length = 30)
    private String rol;


    //Versión original
    /*@ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "nit_Empresa")
    Empresa empresa;*/

    @ManyToOne
    @JoinColumn(name = "nit_Empresa")
    Empresa empresa;



    public Empleado(String documento, String nombre, String correo, String rol, Empresa empresa) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.empresa = empresa;
    }

    public Empleado(){

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
