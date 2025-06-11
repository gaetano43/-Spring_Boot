package com.develhope.biblioteca.controller;

import com.develhope.biblioteca.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EserciziController {
    @GetMapping("/v1/ciao")
    public String salutaRegione (@RequestParam (required = false) String nome,
                                 @RequestParam (required = false) String provincia ){
        return "Ciou"+nome +", com'è il tempo in "+ provincia+"?";

    }
    @GetMapping("/v2/ciao/Lombardia")
    public User salutaRegione (@RequestParam (required = false) String nome
                                ){
        return new User(nome,"Lombardia","Ciao "+nome+", com'è il tempo in Lombardia?") ;

    }
}
