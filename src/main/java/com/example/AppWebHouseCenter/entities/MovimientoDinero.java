package com.example.AppWebHouseCenter.entities;

import javax.persistence.Entity;

@Entity
public class MovimientoDinero {
    private Double montoMovimiento;
    private Double montosPositivos;
    private Double montosNegativos;
    private String conceptoMovimiento;
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



