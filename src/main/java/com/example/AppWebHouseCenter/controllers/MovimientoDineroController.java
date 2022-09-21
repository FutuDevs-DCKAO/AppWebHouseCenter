package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.entities.MovimientoDinero;
import com.example.AppWebHouseCenter.services.EmpresaService;
import com.example.AppWebHouseCenter.services.ImpMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @PostMapping("/movements")
    public MovimientoDinero insertarNuevosMovimientos(@RequestBody MovimientoDinero movimientoDinero){
        return impMovimientoDineroService.crearMovimientoDinero(movimientoDinero);
    }

    @GetMapping("/{idMovimiento}/movements")
    public MovimientoDinero consultaMovimientoporId(@PathVariable("idMovimiento") String idMovimiento){
        return impMovimientoDineroService.consultarMovimientoDineroporId(idMovimiento);
    }
    @PatchMapping("/{idMovimiento}/movements")
    public MovimientoDinero actualizarMovimientoDineroId(@PathVariable("idMovimiento") String idMovimiento, @RequestBody Map<Object, Object> objectMap){
        return impMovimientoDineroService.actualizarMovimientoDineroPorId(idMovimiento, objectMap);
    }

    @DeleteMapping("/{idMovimiento}/movements")
    public void eliminarMovimientoDineroPorId(@PathVariable("idMovimiento") String idMovimiento){
       impMovimientoDineroService.eliminarMovimientoDinero(idMovimiento);
    }
}
