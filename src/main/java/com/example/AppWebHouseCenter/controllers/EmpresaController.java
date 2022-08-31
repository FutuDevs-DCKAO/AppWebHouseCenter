package com.example.AppWebHouseCenter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    @GetMapping("/enterprises")
    public String getEmpresa(){
        return null;
    }

    //Pendiente configuración del controller de tipo POST
    @PostMapping("/enterprises")
    public String postEmpresa(){
        return null;
    }

}
