package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.entities.MovimientoDinero;
import com.example.AppWebHouseCenter.services.ImpMovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;
import java.util.Map;

@RequestMapping("/enterprises/{idMovimiento}/movements ")

public class MovimientoDineroController {

    @Autowired
    private ImpMovimientoDineroService impMovimientoDineroService;

    @GetMapping
    public MovimientoDinero consultarMovimientoPorId(@PathVariable("idMovimiento") String idMovimiento){
        return impMovimientoDineroService.consultarMovimientoDineroporId(idMovimiento);
    }

    @PostMapping
    public MovimientoDinero insertarNuevosMovimientos(@RequestBody MovimientoDinero movimientoDinero){
        return impMovimientoDineroService.crearMovimientoDinero(movimientoDinero);
    }

    @PatchMapping
    public MovimientoDinero actualizarMovimientoPorId(@PathVariable("idMovimiento") String idMovimiento, @RequestBody Map<Object, Object> objectMap){
        return impMovimientoDineroService.actualizarMovimientoDineroPorId(idMovimiento, objectMap);
    }

    @DeleteMapping
    public void eliminarMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero){
        impMovimientoDineroService.eliminarMovimientoDinero(movimientoDinero.getIdMovimiento());
    }
}
