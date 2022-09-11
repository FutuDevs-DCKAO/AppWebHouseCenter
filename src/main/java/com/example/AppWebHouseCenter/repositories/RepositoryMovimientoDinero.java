package com.example.AppWebHouseCenter.repositories;

import com.example.AppWebHouseCenter.entities.MovimientoDinero;
import com.example.AppWebHouseCenter.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryMovimientoDinero extends JpaRepository<MovimientoDinero, String> {
}
