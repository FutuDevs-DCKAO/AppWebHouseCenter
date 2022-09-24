package com.example.AppWebHouseCenter.repositories;

import com.example.AppWebHouseCenter.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAdmUser extends JpaRepository<Usuario, String> {

    Usuario findByEmail(String email);
}
