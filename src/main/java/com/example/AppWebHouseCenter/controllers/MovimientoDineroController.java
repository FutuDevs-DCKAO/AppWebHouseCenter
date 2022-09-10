package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.entities.MovimientoDinero;
import com.example.AppWebHouseCenter.services.ImpMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/enterprises")
@RestController
public class MovimientoDineroController {

    @Autowired
    private ImpMovimientoDineroService impMovimientoDineroService;

    @PostMapping("/movements")
    public MovimientoDinero insertarNuevosMovimientos(@RequestBody MovimientoDinero movimientoDinero){
        return impMovimientoDineroService.crearMovimientoDinero(movimientoDinero);
    }

    @GetMapping("/{idMovimiento}/movements")
    public MovimientoDinero consultaEmpleadoporId(@PathVariable("idMovimiento") String idMovimiento){
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
