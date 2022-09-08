package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.entities.MovimientoDinero;

import java.util.List;
import java.util.Map;

public interface MovimientoDineroService {
    public MovimientoDinero consultaMovimientoDineroporId(Integer idMovimiento); //Consulta un movimiento de dinero por ID

    MovimientoDinero ConsultarPorId(Integer idMovimiento);

    public MovimientoDinero crearMovimientoDinero(MovimientoDinero movimientoDinero); //Crea un nuevo movimiento de dinero

    public MovimientoDinero editarMovimientoDinero(Integer idMovimiento, Map<Object,Object> objectMap); //Edita un movimiento de dinero existente
    public void eliminarMovimientoDinero(Integer idMovimiento); //Elimina un movimiento de dinero existente
}
