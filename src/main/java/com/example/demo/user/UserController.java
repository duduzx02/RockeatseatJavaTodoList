package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel user){
        var usuario = this.userRepository.findByUsername(user.getUsername());

        if(usuario != null){
            System.out.println("Usuário jáexiste");
            return null;
        }



        var usedCreated = this.userRepository.save(user);
        return usedCreated;
    }
}
