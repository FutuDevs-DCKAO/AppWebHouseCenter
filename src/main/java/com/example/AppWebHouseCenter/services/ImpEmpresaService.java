package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.repositories.RepositoryEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpEmpresaService implements EmpresaService {

    @Autowired
    private RepositoryEmpresa repositoryEmpresa;

    @Override
    public List<Empresa> listarEmpresas() {

        return repositoryEmpresa.findAll();
    }

    @Override
    public Empresa consultarEmpresaPorId(Double nitEmpresa) {

        return repositoryEmpresa.findById(nitEmpresa).get();
    }

    @Override
    public Empresa crearEmpresa(Empresa empresa) {

        return repositoryEmpresa.save(empresa);
    }

    @Override
    public Empresa editarEmpresa(Empresa empresa) {

        return repositoryEmpresa.save(empresa);
    }

    @Override
    public void eliminarEmpresa(double nitEmpresa) {

        repositoryEmpresa.deleteById(nitEmpresa);
    }
}
