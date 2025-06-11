package com.develhope.biblioteca.controller;

import com.develhope.biblioteca.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloWordController {


    @GetMapping
    public  String HelloWord() {
        return "Hello word!";
    }

    @GetMapping("/personalizato")
    public  String HelloWord2(@RequestParam (required = false) String nome){
        if (nome != null){
            return "Hello "+ nome +"!";
        }else {
            return "hello  inseisci il nome";
        }

    }
    @GetMapping("/personalizato+def")
    public  String HelloPersonalizato(@RequestParam (required = false, defaultValue ="utente" ) String nome){
        return "Hello "+ nome +"!";

        }
    @GetMapping("/personalizato+def-n")
    public  String HelloPersonalizatoXn(@RequestParam (required = false, defaultValue ="utente" ) String nome,
                                        @RequestParam  (required = false, defaultValue = "1") int n ){//,
        if (n < 1) n = 1;
        StringBuilder scritta = new StringBuilder();
        for (int i = 0; i < n; i++) {
          scritta.append("Hello "+ nome +"!");
        }
        return scritta.toString();

    }
      @GetMapping("/movie")
    public Movie movie(){
        return new Movie(1,"scemo",2000);
      }
    }

