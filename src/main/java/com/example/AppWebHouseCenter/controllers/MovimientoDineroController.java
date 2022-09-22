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

//@RequestMapping("/enterprises")
//@RestController
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

    @GetMapping("/{idMovimiento}/movements")
    public MovimientoDinero consultaMovimientoporId(@PathVariable("idMovimiento") String idMovimiento){
        return impMovimientoDineroService.consultarMovimientoDineroporId(idMovimiento);
    }

    @GetMapping("enterprises/movements/register")
    public String registroMovimientoFormulario(Model model){
        model.addAttribute("movimientoinsertar", new MovimientoDinero());
        return ("formMovimientoDinero");
    }

    @PostMapping("movements/save")
    public String insertarNuevosMovimientos(@Validated MovimientoDinero movimientoDinero){
        impMovimientoDineroService.crearMovimientoDinero(movimientoDinero);
        return "redirect:/enterprises/movements/all";
    }


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
