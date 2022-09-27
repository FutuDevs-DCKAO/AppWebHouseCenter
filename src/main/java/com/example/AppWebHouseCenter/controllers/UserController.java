package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.services.ImpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private ImpUserService impUserService;

    //Método para obtener todos los empleados en una lista
    @GetMapping("/users")
    public String listarempleados(Model model){
        model.addAttribute("empleados", this.impUserService.listarempleados());
        return ("tableEmpleados");
    }

    //Método para obtener el empleado por medio de su documento
    @GetMapping("/users/{documento}")
    public Empleado consultaEmpleadoporId(@PathVariable("documento") String documento){
        return impUserService.consultaEmpleadoporId(documento);
    }

    //-------------------------------------------------------------------

    //Método para mostrar el formulario de registro de los nuevos empleados a insertar
    @GetMapping("/users/register")
    public String registrarEmpleado(Model model){
        model.addAttribute("empleadoinsertar", new Empleado());
        return ("formEmpleados");
    }
    //Método para redireccionar al sitio cuando el nuevo empleado haya sido registrado
    @PostMapping("/users/save")
    public String crearEmpleados(@Validated Empleado empleado){
        impUserService.crearEmpleados(empleado);
        return "redirect:/users";
    }

    //----------------------------------------------

    //Método para almacenar el docuemnto del empleado mientras es redireccionado al formluario de actualización
    @GetMapping("users/update/{documento}")
    public String formularioActualizarEmpleado(@PathVariable("documento") String documento, Model model){
        Empleado empleado = impUserService.consultaEmpleadoporId(documento);
        model.addAttribute("empleadoactualizar", empleado);
        return ("formEmpleadosUpdate");
    }

    //Redireccionamiento a la lista de empleados cuando se haya realizado la actualización
    @PostMapping("users/update")
    public String actualizarEmpleado(@Validated Empleado empleado){
        impUserService.actualizarEmpleado(empleado);
        return "redirect:/users";
    }

    //----------------------------------------------------------------

    //Response PUT para actualizar los datos de un empleado a través de la PK en POSTMAN
    /*@PatchMapping("/{documento}")
    public Empleado editarEmpleado(@PathVariable("documento") String documento, @RequestBody Map<Object, Object> objectMap){
        return impUserService.editarEmpleado(documento, objectMap);
    }*/

    //-----------------------------------------------------------------

    @GetMapping("/users/delete/{documento}")
    public String eliminarEmpleadoPorDocumento(@PathVariable("documento") String documento){
        impUserService.eliminarEmpleadoPorId(documento);
        return "redirect:/users";
    }

    //------------------------------------------------------------------

    /*@DeleteMapping("/{documento}")
    public void eliminarEmpleado(@PathVariable("documento") String documento){
        impUserService.eliminarEmpleado(documento);
    }*/
}
