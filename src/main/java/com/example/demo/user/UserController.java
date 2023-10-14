package com.example.demo.user;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity create(@RequestBody UserModel user){
        var usuario = this.userRepository.findByUsername(user.getUsername());

        if(usuario != null){
            return ResponseEntity.status(HttpStatus.CREATED).body("Usuário já existe");
        }

        var passwordHash = BCrypt.withDefaults().hashToString(12, user.getPassword().toCharArray());

        user.setPassword(passwordHash);

        var usedCreated = this.userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(usedCreated);
    }
}
