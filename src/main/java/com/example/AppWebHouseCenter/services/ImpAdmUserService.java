package com.example.AppWebHouseCenter.services;

import com.example.AppWebHouseCenter.entities.Usuario;
import com.example.AppWebHouseCenter.repositories.RepositoryAdmUser;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ImpAdmUserService {

  private RepositoryAdmUser repositoryAdmUser;

  public ImpAdmUserService(RepositoryAdmUser repositoryAdmUser){
      this.repositoryAdmUser=repositoryAdmUser;
  }

  public Usuario guardaUsuario(Usuario usuario){
      return this.repositoryAdmUser.save(usuario);

  }
  public Usuario buscarPorEmail(String email){
      return this.repositoryAdmUser.findByEmail(email);

  }

  public Usuario obtenerUsuario(Map<String,Object> datousuario){

      String email=(String)datousuario.get("email");
      Usuario usuario=buscarPorEmail(email);

      if(usuario==null){
          String nombre=(String) datousuario.get("nickname");
          String image=(String) datousuario.get("picture");
          String correo=(String) datousuario.get("email");
          Usuario usuarioAdm=new Usuario(correo,image,nombre);
          return guardaUsuario(usuarioAdm);
      }

      System.out.print(usuario.getEmail());
      return  usuario;

  }

}
