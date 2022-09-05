package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.MovimientoDinero;
import com.example.AppWebHouseCenter.repositories.RepositoryMovimientoDinero;

import java.util.List;

public class ImpMovimientoDineroService implements MovimientoDineroService {

    private RepositoryMovimientoDinero repositoryMovimientoDinero;
    @Override
    public List<MovimientoDinero> listarMovimientosDinero() {
        return repositoryMovimientoDinero.findAll();
    }

    @Override
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero movimientoDinero) {
        return repositoryMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public MovimientoDinero consultaMovimientoDineroporId(Integer idMovimiento) {
        return repositoryMovimientoDinero.findById(idMovimiento).get();
    }

    @Override
    public MovimientoDinero editarMovimientoDinero(MovimientoDinero movimientoDinero) {
        return repositoryMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public void eliminarMovimientoDinero(Integer idMovimiento) {
        repositoryMovimientoDinero.deleteById(idMovimiento);
    }
}
