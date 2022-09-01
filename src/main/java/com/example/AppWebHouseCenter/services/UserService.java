package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empleado;

import java.util.List;

public interface UserService {
    public List<Empleado>listarempleados();
    public Empleado crearEmpleados(Empleado empleado);
    public Empleado consultaEmpleadosporId(Integer documento);
    public Empleado editarEmpleados(Empleado empleado);
    public void eliminarEmpleado(Integer documento);


}
