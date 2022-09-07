package com.example.AppWebHouseCenter.entities;

import javax.persistence.*;

@Entity
@Table
public class MovimientoDinero {

    @Id
    private int idMovimiento;
    @Column(name = "monto_Movimiento", nullable = false)
    private Double montoMovimiento;
    @Column(name = "montos_Positivos", nullable = false)
    private Double montosPositivos;
    @Column(name = "montos_Negativos", nullable = false)
    private Double montosNegativos;
    @Column(name = "concepto_Movimiento", nullable = false)
    private String conceptoMovimiento;
    @Column(name = "usuario_Movimiento", nullable = false)
    private Empleado usuarioMovimiento;

    @ManyToOne
        @JoinColumn(name = "nit_Empresa")
        Empresa empresa;
    @ManyToOne
        @JoinColumn(name = "documento_Empleado")
        Empleado empleado;

    public MovimientoDinero(Double montoMovimiento, Double montosPositivos, Double montosNegativos, String conceptoMovimiento, Empleado usuarioMovimiento, Empresa empresa, Empleado empleado) {
        this.montoMovimiento = montoMovimiento;
        this.montosPositivos = montosPositivos;
        this.montosNegativos = montosNegativos;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioMovimiento = usuarioMovimiento;
        this.empresa = empresa;
        this.empleado = empleado;
    }


    public MovimientoDinero(){

    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
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

    public Empleado getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(Empleado usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
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



