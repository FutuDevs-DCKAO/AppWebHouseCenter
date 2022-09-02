package com.example.AppWebHouseCenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empleado")
public class Empleado {

    @Id
    private int documento;
    @Column(name = "nombreEmpleado", length = 50, nullable = false)
    private String nombreEmpleado;
    @Column(name = "correoEmpleado", length = 50, nullable = false)
    private String correoEmpleado;
    @Column(name = "empresaPertenciente", nullable = false)
    private Empresa empresaPertenciente;
    @Column(name = "rol", length = 40, nullable = false)
    private String rol;

    public Empleado(String nombre, String correo, Empresa empresaPertenciente, String rol){
        this.nombreEmpleado = nombre;
        this.correoEmpleado = correo;
        this.empresaPertenciente = empresaPertenciente;
        this.rol = rol;

    }

    public Empleado(){

    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
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
