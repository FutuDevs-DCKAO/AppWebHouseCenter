package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empresa;

import java.util.List;
import java.util.Map;

public interface EmpresaService {
    public List<Empresa> listarEmpresas(); //lista todas las empresas
    public Empresa crearEmpresa(Empresa empresa); //Crear una empresa nueva
    public Empresa consultarEmpresaPorId(String nitEmpresa); //permite consultar una empresa por su NIT
    public Empresa actualizarEmpresaPorId(String nitEmpresa, Map<Object,Object> objectMap); // modifica una empresa existente
    public void eliminarEmpresaPorId(String nitEmpresa); // borra empresa

}
