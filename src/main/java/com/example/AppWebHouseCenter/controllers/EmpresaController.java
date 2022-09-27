package com.example.AppWebHouseCenter.controllers;
import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.entities.Usuario;
import com.example.AppWebHouseCenter.services.ImpAdmUserService;
import com.example.AppWebHouseCenter.services.ImpEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.validation.ValidationErrors;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;



@Controller
public class EmpresaController {

    //Creación objeto clase ImpEmpresaService para poder acceder a los métodos de la clase
    @Autowired
    private ImpEmpresaService impEmpresaService;


    //Método para poder obtener todas las empresas registradas en el sistema
    @GetMapping("/enterprises")
    public String listarEmpresas(Model model){
        model.addAttribute("empresas", this.impEmpresaService.listarEmpresas());
        return ("tableEmpresas");
    }

    //Responde GET  a través del objeto creado para obtener una empresa mediante su primary key (NIT)
    @GetMapping("/{nitEmpresa}")
    public Empresa consultarEmpresa(@PathVariable("nitEmpresa") String nitEmpresa){
        return impEmpresaService.consultarEmpresaPorId(nitEmpresa);
    }

    //------------------------------------------------------------------

    //Método para mostrar el formulario de registro para una nueva empresa
    @GetMapping("enterprises/register")
    public String registroNuevaEmpresa(Model model){
        model.addAttribute("empresainsertar", new Empresa());
        return "formEmpresa";
    }

    //Response POST a través del objeto creado para crear nuevas empresas
    @PostMapping("/enterprises/save")
    public String crearEmpresa(@Validated Empresa empresa){
        impEmpresaService.crearEmpresa(empresa);
        return "redirect:/enterprises";
    }

    //---------------------------------------------

    //Método para almacenar el nit de la empresa mientras se es redireccionado al formulario
    @GetMapping("enterprises/update/{nitEmpresa}")
    public String formularioActualizarEmpresa(@PathVariable("nitEmpresa") String nitEmpresa,Model model){
        Empresa empresa = impEmpresaService.consultarEmpresaPorId(nitEmpresa);
        model.addAttribute("empresaactualizar", empresa);
        return "formEmpresaUpdate";
    }

    @PostMapping("enterprises/update")
    public String actualizarEmpresa(@Validated Empresa empresa){
        impEmpresaService.actualizarEmpresa(empresa);
        return "redirect:/enterprises";
    }

    //----------------------------------------------------------------------------------------------------


    //Response PATCH para actualizar los datos de una empresa a través de la PK en POSTMAN
    /*@PatchMapping("/{nitEmpresa}")
    public Empresa actualizarEmpresa(@PathVariable("nitEmpresa") String nitEmpresa, @RequestBody Map<Object, Object> objectMap){
        return impEmpresaService.actualizarEmpresaPorId(nitEmpresa, objectMap);
    }*/

    //------------------------------------------------------

    //Método para la eliminación de una empresa a través de su nit (PK)
    @GetMapping("/enterprises/delete/{nitEmpresa}")
    public String eliminarEmpresaPorNit(@PathVariable("nitEmpresa") String nitEmpresa){
        impEmpresaService.eliminarEmpresaPorId(nitEmpresa);
        return "redirect:/enterprises";
    }

    //------------------------------------------------------

    //Response DELETE para borrar una empresa a través de la PK en POSTMAN
    /*@DeleteMapping("/{nitEmpresa}")
    public void eliminarEmpresa(@PathVariable("nitEmpresa") Empresa empresa){
        impEmpresaService.eliminarEmpresaPorId(empresa.getNitEmpresa());
    }*/

}
