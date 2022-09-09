package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.repositories.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

@Service
public class ImpUserService implements UserService{
    @Autowired
    private RepositoryUser repositoryUser;

    @Override
    public List<Empleado> listarempleados() {
        return repositoryUser.findAll();
    }

    @Override
    public Empleado crearEmpleados(Empleado empleado) {
        return repositoryUser.save(empleado);
    }

    @Override
    public Empleado consultaEmpleadoporId(String documento) {
        return repositoryUser.findById(documento).get();

    }

    @Override
    public Empleado editarEmpleado(String documento, Map<Object,Object> objectMap) {
        Empleado empleado = repositoryUser.findById(documento).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Empleado.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, empleado, value);
        });
        return repositoryUser.save(empleado);
    }
    @Override
    public void eliminarEmpleado(String documento) {
        repositoryUser.deleteById(documento);
    }
}
