package com.example.AppWebHouseCenter.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table
public class MovimientoDinero {

    @Id
    private String idMovimiento;
    @Column(name = "monto_Movimiento", nullable = false)
    private Double montoMovimiento;
    @Column(name = "monto_Positivo", nullable = false)
    private Double montosPositivos;
    @Column(name = "monto_Negativo", nullable = false)
    private Double montosNegativos;
    @Column(name = "concepto_Movimiento", nullable = false)
    private String conceptoMovimiento;

    //Versión original
    /*@ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "nit_Empresa")
    Empresa empresa;*/

    //Versión original
    /*@ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "documento_Empleado")
    Empleado empleado;*/

    @ManyToOne
    @JoinColumn(name = "nit_Empresa")
    Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "documento_Empleado")
    Empleado empleado;

    public MovimientoDinero(String idMovimiento, Double montoMovimiento, Double montosPositivos, Double montosNegativos, String conceptoMovimiento, Empresa empresa, Empleado empleado) {
        this.idMovimiento = idMovimiento;
        this.montoMovimiento = montoMovimiento;
        this.montosPositivos = montosPositivos;
        this.montosNegativos = montosNegativos;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empresa = empresa;
        this.empleado = empleado;
    }

    public MovimientoDinero(){

    }

    public String getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(String idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(Double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public Double getMontosPositivos() {
        return montosPositivos;
    }

    public void setMontosPositivos(Double montosPositivos) {
        this.montosPositivos = montosPositivos;
    }

    public Double getMontosNegativos() {
        return montosNegativos;
    }

    public void setMontosNegativos(Double montosNegativos) {
        this.montosNegativos = montosNegativos;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}



