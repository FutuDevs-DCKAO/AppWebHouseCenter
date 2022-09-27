package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.entities.MovimientoDinero;
import com.example.AppWebHouseCenter.services.EmpresaService;
import com.example.AppWebHouseCenter.services.ImpMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class MovimientoDineroController {

    @Autowired
    private ImpMovimientoDineroService impMovimientoDineroService;

    //Método que permite mostrar todos los movimientos de dinero en la tabla de los movimientos
    @GetMapping("/enterprises/movements/all") //Permite listar todos los movimientos de dinero de una empresa
    public String listarMovimientos(Model model){
        model.addAttribute("movimientosDinero",this.impMovimientoDineroService.listarMovimientos());
        return ("tableMovimientosDinero");
    }

    //Método para obtener el movimiento de dinero por medio de su identifcación
    @GetMapping("/{idMovimiento}/movements")
    public MovimientoDinero consultaMovimientoporId(@PathVariable("idMovimiento") String idMovimiento){
        return impMovimientoDineroService.consultarMovimientoDineroporId(idMovimiento);
    }

    //----------------------------------------------------------------------

    //Método para mostrar el formulario de registor de un nuevo movimiento de dinero
    @GetMapping("enterprises/movements/register")
    public String registroMovimientoFormulario(Model model){
        model.addAttribute("movimientoinsertar", new MovimientoDinero());
        return ("formMovimientoDinero");
    }

    //Método para redireccionar al usuario cuando el movimiento de dinero ya fue creado con éxito
    @PostMapping("enterprises/movements/save")
    public String insertarNuevosMovimientos (@Validated MovimientoDinero movimientoDinero){

        impMovimientoDineroService.crearMovimientoDinero(movimientoDinero);
        return "redirect:/enterprises/movements/all";

    }

    //-----------------------------------------------------------------------------

    //Método para almacenar el id del movimiento mientras se es redireccionado al formulario de actualización
    @GetMapping("enterprises/movements/update/{idMovimiento}")
    public String formularioActualizarMovimientoDinero(@PathVariable("idMovimiento") String idMovimiento, Model model){
        MovimientoDinero movimientoDinero = impMovimientoDineroService.consultarMovimientoDineroporId(idMovimiento);
        model.addAttribute("movimientoactualizar", movimientoDinero);
        return ("formMovimientoDineroUpdate");
    }

    //Redireccionamiento a la lista de movimientos de dinero cuando se haya realizado la actualización de la info que este comprende
    @PostMapping("enterprises/movements/update")
    public String actualizarMovimientoDinero(@Validated MovimientoDinero movimientoDinero){
        impMovimientoDineroService.actualizarMovimiento(movimientoDinero);
        return "redirect:/enterprises/movements/all";
    }

    //----------------------------------------------------------

    @PatchMapping("/{idMovimiento}/movements")
    public MovimientoDinero actualizarMovimientoDineroId(@PathVariable("idMovimiento") String idMovimiento, @RequestBody Map<Object, Object> objectMap){
        return impMovimientoDineroService.actualizarMovimientoDineroPorId(idMovimiento, objectMap);
    }

    @DeleteMapping("/enterprises/{idMovimiento}/movements")
    public void eliminarPorIdPruebaPostMan(@PathVariable("idMovimiento") String idMovimiento){
        impMovimientoDineroService.eliminarMovimientoDinero(idMovimiento);
    }

    //Método get para la eliminación del movimiento de dinero en la tabla de movimientos
    /*@GetMapping("/enterprises/movements/all/eliminar/{idMovimiento}")
    public String eliminarMovimientoDineroPorId(@PathVariable("idMovimiento") String idMovimiento){
       impMovimientoDineroService.eliminarMovimientoDinero(idMovimiento);
       return ("redirect:/enterprises/movements/all");
    }*/
}