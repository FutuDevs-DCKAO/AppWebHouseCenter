package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empleado;

import java.util.List;

public interface UserService {
    public List<Empleado>listarempleados();
    public Empleado crearEmpleados(Empleado empleado);
    public Empleado consultaEmpleadoporId(String documento);
    public Empleado editarEmpleado(Empleado empleado);
    public void eliminarEmpleado(String documento);


}
