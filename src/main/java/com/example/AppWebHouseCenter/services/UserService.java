package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empleado;

import java.util.List;

public interface UserService {
    public List<Empleado> listarempleados(); //Lista todos los usuarios
    public Empleado crearEmpleados(Empleado empleado); //Crea un usuario
    public Empleado consultaEmpleadoporId(String documento); //Consulta un empleado por documento
    public Empleado editarEmpleado(Empleado empleado); //Edita un usuario existente
    public void eliminarEmpleado(String documento); //Elimina un usuario existente


}
