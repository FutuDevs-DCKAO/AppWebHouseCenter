package com.example.AppWebHouseCenter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movimientoDinero")
public class MovimientoDinero {

    @Id
    private int idMovimiento;
    @Column(name = "montoMovimiento", nullable = false)
    private Double montoMovimiento;
    @Column(name = "montosPositivos")
    private Double montosPositivos;
    @Column(name = "montosNegativos")
    private Double montosNegativos;
    @Column(name = "conceptoMovimiento", length = 80, nullable = false)
    private String conceptoMovimiento;
    @Column(name = "usuarioMovimiento", nullable = false)
    private Empleado usuarioMovimiento;

    public MovimientoDinero(Double montoMovimiento, Double montosPositivos, Double montosNegativos, String conceptoMovimiento, Empleado usuarioMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.montosPositivos = montosPositivos;
        this.montosNegativos = montosNegativos;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioMovimiento = usuarioMovimiento;
    }


    public MovimientoDinero(){

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

    public Empleado getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(Empleado usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }
}



