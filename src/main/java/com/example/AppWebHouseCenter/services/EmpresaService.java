package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empresa;

import java.util.List;

public interface EmpresaService {
    public List<Empresa> listarEmpresas(); //lista todas las empresas
    public Empresa crearEmpresa(Empresa empresa); //Crear una empresa nueva
    public Empresa consultarEmpresaPorId(String nitEmpresa); //permite consultar una empresa por su NIT
    public Empresa editarEmpresa(Empresa empresa); // modifica una empresa existente
    public void eliminarEmpresa(String nitEmpresa); // borra empresa

}
