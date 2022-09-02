package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Empresa;
import com.example.AppWebHouseCenter.services.ImpEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/enterprises")
@RestController
public class EmpresaController {

    //Creación objeto clase ImpEmpresaService para poder acceder a los métodos de la clase
    @Autowired
    private ImpEmpresaService impEmpresaService;

    //Response GET a través del objeto creado para obtener todas las empresas
    @GetMapping
    public List<Empresa> listar(){
        return impEmpresaService.listarEmpresas();
    }

    //Response POST a través del objeto creado para crear nuevas empresas
    @PostMapping
    public Empresa insertar(@RequestBody Empresa empresa){

        return impEmpresaService.crearEmpresa(empresa);
    }

    //Response PUT a través del objeto creado para actualizar los datos de una empresa
    @PutMapping
    public Empresa actualizar(@RequestBody Empresa empresa){
        return impEmpresaService.editarEmpresa(empresa);
    }

    //Response DELETE a través del objeto para eliminar los datos de una empresa
    @DeleteMapping
    public void eliminar(@RequestBody Empresa empresa){
        impEmpresaService.eliminarEmpresa(empresa.getNitEmpresa());
    }

}
