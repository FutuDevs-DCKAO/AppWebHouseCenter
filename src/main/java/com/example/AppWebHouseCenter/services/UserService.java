package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empleado;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<Empleado> listarempleados(); //Lista todos los usuarios
    public Empleado crearEmpleados(Empleado empleado); //Crea un usuario
    public Empleado consultaEmpleadoporId(String documento); //Consulta un empleado por documento
    public Empleado editarEmpleado(String documento, Map<Object,Object> objectMap); //Edita un usuario existente
    public Empleado actualizarEmpleado(Empleado empleado); //Actualización de los datos de un empleado
    public void eliminarEmpleadoPorId(String documento); //Elimina un usuario existente

}
