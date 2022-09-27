package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.repositories.RepositoryEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ImpEmpresaService implements EmpresaService {

    @Autowired
    private RepositoryEmpresa repositoryEmpresa;

    @Override
    public List<Empresa> listarEmpresas() {

        return repositoryEmpresa.findAll();
    }

    @Override
    public Empresa crearEmpresa(Empresa empresa) {

        return repositoryEmpresa.save(empresa);
    }

    @Override
    public Empresa consultarEmpresaPorId(String nitEmpresa) {

        return repositoryEmpresa.findById(nitEmpresa).get();
    }

    @Override
    public Empresa actualizarEmpresa(Empresa empresa){
        return repositoryEmpresa.save(empresa);
    }

    @Override
    public Empresa actualizarEmpresaPorId(String nitEmpresa, Map<Object, Object> objectMap) {

        Empresa empresa = repositoryEmpresa.findById(nitEmpresa).get();

        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empresa.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, empresa,value);
        });
        return repositoryEmpresa.save(empresa);
    }

    @Override
    public void eliminarEmpresaPorId(String nitEmpresa) {
        repositoryEmpresa.deleteById(nitEmpresa);
    }

}
