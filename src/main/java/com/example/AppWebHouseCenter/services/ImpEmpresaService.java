package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpEmpresaService implements EmpresaService {

    @Override
    public List<Empresa> listarEmpresas() {
        return null;
    }

    @Override
    public Empresa consultarEmpresaPorId(double nitEmpresa) {
        return null;
    }

    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        return null;
    }

    @Override
    public Empresa editarEmpresa(Empresa empresa) {
        return null;
    }

    @Override
    public void eliminarEmpresa(double nitEmpresa) {

    }
}
