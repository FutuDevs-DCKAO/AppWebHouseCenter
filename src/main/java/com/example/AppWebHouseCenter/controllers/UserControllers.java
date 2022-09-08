package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.services.ImpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController

public class UserControllers {
    @Autowired
    private ImpUserService impUserService;

    @GetMapping
    public List<Empleado> listarempleados(){return impUserService.listarempleados();}

    @PostMapping
    public Empleado crearEmpleados(@RequestBody Empleado empleado){
        return impUserService.crearEmpleados(empleado);
    }

    @GetMapping("/{documento}")
    public Empleado consultaEmpleadoporId(@PathVariable("documento") String documento){
        return impUserService.consultaEmpleadoporId(documento);
    }

    @PatchMapping
    public Empleado editarEmpleado(@RequestBody Empleado empleado){
        return impUserService.editarEmpleado(empleado);
    }

    @DeleteMapping("/{documento}")
    public void eliminarEmpleado(@PathVariable("documento") String documento){
        impUserService.eliminarEmpleado(documento);
    }


}
