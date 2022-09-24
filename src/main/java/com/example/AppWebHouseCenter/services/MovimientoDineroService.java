package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.MovimientoDinero;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface MovimientoDineroService {

    public List<MovimientoDinero> listarMovimientos(); //Permite consultar todos los movimientos
    public MovimientoDinero consultarMovimientoDineroporId(String idMovimiento); //Consulta un movimiento de dinero por ID
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero movimientoDinero); //Crea un nuevo movimiento de dinero
    public MovimientoDinero actualizarMovimientoDineroPorId(String idMovimiento, Map<Object,Object> objectMap); //Edita un movimiento de dinero existente
    //Método para actualizar los movimientos de dinero a través de un objeto de la clase movimientoDinero
    public MovimientoDinero actualizarMovimiento(MovimientoDinero movimientoDinero);
    public void eliminarMovimientoDinero(String idMovimiento); //Elimina un movimiento de dinero existente

}
