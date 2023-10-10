package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    /**
     * # Métodos de acesso do HTTP
     *  Get - Busca uma informação
     *  Post - Adiciona uma informação
     *  Put - Altera uma informação
     *  Delete - Remove uma informação
     *  Patch - Altera apenas uma parte da informação
     ***/

    // Método de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMenssagem(){
        return "Funcionou";
    }
}


