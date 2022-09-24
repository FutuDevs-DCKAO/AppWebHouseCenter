package com.example.AppWebHouseCenter.controllers;

import com.example.AppWebHouseCenter.entities.Usuario;
import com.example.AppWebHouseCenter.services.ImpAdmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdmUserController {
    @Autowired

    private ImpAdmUserService impAdmUserService;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal !=null) {
            Usuario usuario = this.impAdmUserService.obtenerUsuario(principal.getClaims());
            System.out.print(principal.getClaims());
            model.addAttribute("usuario",usuario);
        }
        return "index";
    }
}
