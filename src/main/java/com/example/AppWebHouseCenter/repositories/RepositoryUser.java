package com.example.AppWebHouseCenter.repositories;

import com.example.AppWebHouseCenter.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUser extends JpaRepository<Empleado, String > {

}
