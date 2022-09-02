package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empresa;

import java.util.List;

public interface EmpresaService {
    public List<Empresa> listarEmpresas(); //lista todas las empresar
    public Empresa consultarEmpresaPorId(double nitEmpresa); //permite consultar una empresa por su NIT
    public Empresa crearEmpresa(Empresa empresa); //Crear una empresa nueva
    public Empresa editarEmpresa(Empresa empresa); // modifica una empresa existente

    public void eliminarEmpresa(double nitEmpresa); // borra empresa


}
