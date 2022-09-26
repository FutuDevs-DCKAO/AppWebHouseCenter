package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.services.ImpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@RequestMapping("/users")
//@RestController
@Controller
public class UserControllers {
    @Autowired
    private ImpUserService impUserService;

    //Método para obtener todos los empleados en una lista
    @GetMapping("/users")
    public String listarempleados(Model model){
        model.addAttribute("empleados", this.impUserService.listarempleados());
        return ("tableUsuarios");
    }

    //Método para obtener el empleado por medio de su documento
    @GetMapping("/{documento}")
    public Empleado consultaEmpleadoporId(@PathVariable("documento") String documento){
        return impUserService.consultaEmpleadoporId(documento);
    }

    //-------------------------------------------------------------------

    //Método para mostrar el formulario de registro de los nuevos empleados a insertar
    @GetMapping("users/register")
    public String registrarEmpleado(Model model){
        model.addAttribute("empleadoinsertar", new Empleado());
        return ("formEmpleados");
    }
    //Método para redireccionar al sitio cuando el nuevo empleado haya sido registrado
    @PostMapping("users/save")
    public String crearEmpleados(@Validated Empleado empleado){
        impUserService.crearEmpleados(empleado);
        return "redirect:/users";
    }

    //----------------------------------------------

    @PatchMapping("/{documento}")
    public Empleado editarEmpleado(@PathVariable("documento") String documento, @RequestBody Map<Object, Object> objectMap){
        return impUserService.editarEmpleado(documento, objectMap);
    }

    @DeleteMapping("/{documento}")
    public void eliminarEmpleado(@PathVariable("documento") String documento){
        impUserService.eliminarEmpleado(documento);
    }
}
