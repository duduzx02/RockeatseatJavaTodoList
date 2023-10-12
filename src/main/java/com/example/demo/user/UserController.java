package com.example.demo.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

/**
 * * Modificadores
 * public
 * private
 * protected
 */

public class UserController {
    /**
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) numeros reais
     * Float (float) Números 0.000
     * char (A B c)
     * Date (data)
     * void (sem retorno)
     */

    @PostMapping("/")
    public void create(@RequestBody UserModel user){
        System.out.println(user.username);
    }
}
