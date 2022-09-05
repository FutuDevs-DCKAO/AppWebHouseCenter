package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.repositories.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Empleado editarEmpleado(Empleado empleado) {
        return repositoryUser.save(empleado);
    }

    @Override
    public void eliminarEmpleado(String documento) {
        repositoryUser.deleteById(documento);

    }
}
