package com.example.AppWebHouseCenter.controllers;
import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.entities.Usuario;
import com.example.AppWebHouseCenter.services.ImpAdmUserService;
import com.example.AppWebHouseCenter.services.ImpEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RequestMapping("/enterprises")
@RestController
public class EmpresaController {

    //Creación objeto clase ImpEmpresaService para poder acceder a los métodos de la clase
    @Autowired
    private ImpEmpresaService impEmpresaService;
    @Autowired


   /* @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal !=null) {
            System.out.print(principal.getClaims());
        }
        return "index";
    }*/
    //Response GET a través del objeto creado para obtener todas las empresas
    @GetMapping
    public List<Empresa> listarEmpresas(){
        return impEmpresaService.listarEmpresas();
    }

    //Response POST a través del objeto creado para crear nuevas empresas
    @PostMapping
    public Empresa crearEmpresa(@RequestBody Empresa empresa){

        return impEmpresaService.crearEmpresa(empresa);
    }

    //Responde GET  a través del objeto creado para obtener una empresa mediante su primary key (NIT)
    @GetMapping("/{nitEmpresa}")
    public Empresa consultarEmpresa(@PathVariable("nitEmpresa") String nitEmpresa){
        return impEmpresaService.consultarEmpresaPorId(nitEmpresa);
    }

    //Response PUT para actualizar los datos de una empresa a través de la primary key (NIT)
    @PatchMapping("/{nitEmpresa}")
    public Empresa actualizarEmpresa(@PathVariable("nitEmpresa") String nitEmpresa, @RequestBody Map<Object, Object> objectMap){
        return impEmpresaService.actualizarEmpresaPorId(nitEmpresa, objectMap);
    }

    //Response DELETE para borrar una empresa a través de la primary key (NIT)
    @DeleteMapping("/{nitEmpresa}")
    public void eliminarEmpresa(@PathVariable("nitEmpresa") Empresa empresa){
        impEmpresaService.eliminarEmpresaPorId(empresa.getNitEmpresa());
    }
//-----------------------------------------------

}
