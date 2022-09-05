package com.example.AppWebHouseCenter.entities;

import javax.persistence.*;

@Entity
@Table(name = "Empleados")
public class Empleado {

    @Id
    private int documento;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;
    @Column(name = "empresa_Perteneciente", nullable = false)
    private Empresa empresaPertenciente;
    @Column(name = "rol", nullable = false, length = 30)
    private String rol;

    @ManyToOne
        @JoinColumn(name = "nit_Empresa")
        Empresa empresa;

    public Empleado(int documento, String nombre, String correo, Empresa empresaPertenciente, String rol, Empresa empresa) {
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.empresaPertenciente = empresaPertenciente;
        this.rol = rol;
        this.empresa = empresa;
    }

    public Empleado(){

    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
