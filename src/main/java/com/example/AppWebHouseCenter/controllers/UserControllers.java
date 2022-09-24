package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.services.ImpUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//@RequestMapping("/users")
//@RestController
@Controller
public class UserControllers {
    @Autowired
    private ImpUserService impUserService;

    @GetMapping("/users")
    public String listarempleados(Model model){
        model.addAttribute("empleados", this.impUserService.listarempleados());
        return ("tableUsuarios");
    }

    @PostMapping
    public Empleado crearEmpleados(@RequestBody Empleado empleado){
        return impUserService.crearEmpleados(empleado);
    }

    @GetMapping("/{documento}")
    public Empleado consultaEmpleadoporId(@PathVariable("documento") String documento){
        return impUserService.consultaEmpleadoporId(documento);
    }

    @PatchMapping("/{documento}")
    public Empleado editarEmpleado(@PathVariable("documento") String documento, @RequestBody Map<Object, Object> objectMap){
        return impUserService.editarEmpleado(documento, objectMap);
    }

    @DeleteMapping("/{documento}")
    public void eliminarEmpleado(@PathVariable("documento") String documento){
        impUserService.eliminarEmpleado(documento);
    }
}
