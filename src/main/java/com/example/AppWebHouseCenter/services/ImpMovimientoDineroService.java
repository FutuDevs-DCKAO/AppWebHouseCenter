package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.MovimientoDinero;
import com.example.AppWebHouseCenter.repositories.RepositoryMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ImpMovimientoDineroService implements MovimientoDineroService {
    @Autowired
    private RepositoryMovimientoDinero repositoryMovimientoDinero;

    @Override
    public List<MovimientoDinero> listarMovimientos() {
        return repositoryMovimientoDinero.findAll();
    }

    @Override
    public MovimientoDinero consultarMovimientoDineroporId(String idMovimiento) {
        return repositoryMovimientoDinero.findById(idMovimiento).get();
    }

    @Override
    public MovimientoDinero actualizarMovimiento(MovimientoDinero movimientoDinero) {
        return repositoryMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero movimientoDinero) {
        return repositoryMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public MovimientoDinero actualizarMovimientoDineroPorId(String idMovimiento, Map<Object, Object> objectMap) {
        MovimientoDinero movimientoDinero = repositoryMovimientoDinero.findById(idMovimiento).get();

        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(MovimientoDinero.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, movimientoDinero,value);
        });
        return repositoryMovimientoDinero.save(movimientoDinero);
    }

    @Override
    public void eliminarMovimientoDinero(String idMovimiento) {

        repositoryMovimientoDinero.deleteById(idMovimiento);
    }
}


