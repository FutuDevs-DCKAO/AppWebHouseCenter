package com.example.AppWebHouseCenter.entities;

import javax.persistence.*;

@Entity
@Table(name = "movimiento_Dinero")
public class MovimientoDinero {

    @Id
    private int idMovimiento;
    @Column(name = "monto_Movimiento", nullable = false)
    private Double montoMovimiento;
    @Column(name = "montos_Positivos")
    private Double montosPositivos;
    @Column(name = "montos_Negativos")
    private Double montosNegativos;
    @Column(name = "concepto_Movimiento", nullable = false)
    private String conceptoMovimiento;
    @Column(name = "usuario_Movimiento")
    private Empleado usuarioMovimiento;

    @ManyToOne
        @JoinColumn(name = "nit_Empresa")
        Empresa empresa;
    @ManyToOne
        @JoinColumn(name = "documento_Empleado")
        Empleado empleado;

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



