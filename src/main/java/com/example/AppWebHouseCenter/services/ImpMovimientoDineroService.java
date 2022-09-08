package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.MovimientoDinero;
import com.example.AppWebHouseCenter.repositories.RepositoryMovimientoDinero;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;


import java.util.Map;

@Service
public class ImpMovimientoDineroService implements MovimientoDineroService {

    private RepositoryMovimientoDinero repositoryMovimientoDinero;
    @Override
    public MovimientoDinero ConsultarPorId(Integer idMovimiento){
        return repositoryMovimientoDinero.findById(idMovimiento).get();

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
    public MovimientoDinero editarMovimientoDinero(Integer idMovimiento, Map<Object, Object> objectMap) {
        MovimientoDinero empresa = repositoryMovimientoDinero.findById(idMovimiento).get();
        objectMap.forEach((key,value)->{
            Field field = ReflectionUtils.findField(MovimientoDinero.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, empresa,value);
        });
        return repositoryMovimientoDinero.save(empresa);

    }



    @Override
    public void eliminarMovimientoDinero(Integer idMovimiento) {
        repositoryMovimientoDinero.deleteById(idMovimiento);
    }
}
