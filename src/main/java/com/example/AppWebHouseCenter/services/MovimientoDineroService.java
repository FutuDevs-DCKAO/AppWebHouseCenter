package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.MovimientoDinero;

import java.util.Map;

public interface MovimientoDineroService {


    MovimientoDinero ConsultarMovimientoPorId(String idMovimiento); //Consultar  movimiento de dinero por ID

    public MovimientoDinero crearMovimientoDinero(MovimientoDinero movimientoDinero); //Crea un nuevo movimiento de dinero

    public MovimientoDinero ActualizarMovimientoDinero(String idMovimiento, Map<Object,Object> objectMap); //Edita un movimiento de dinero existente
    public void eliminarMovimientoDinero(String idMovimiento); //Elimina un movimiento de dinero existente
}
