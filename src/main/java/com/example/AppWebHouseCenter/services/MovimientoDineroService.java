package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Empleado;
import com.example.AppWebHouseCenter.entities.MovimientoDinero;

import java.util.List;

public interface MovimientoDineroService {

    public List<MovimientoDinero> listarMovimientosDinero(); //Lista todos los movimientos de dinero
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero movimientoDinero); //Crea un nuevo movimiento de dinero
    public MovimientoDinero consultaMovimientoDineroporId(Integer idMovimiento); //Consulta un movimiento de dinero por ID
    public MovimientoDinero editarMovimientoDinero(MovimientoDinero movimientoDinero); //Edita un movimiento de dinero existente
    public void eliminarMovimientoDinero(Integer idMovimiento); //Elimina un movimiento de dinero existente
}
