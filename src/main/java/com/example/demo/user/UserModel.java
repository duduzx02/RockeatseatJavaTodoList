package com.example.demo.user;

import lombok.Data;

/*
* @Getter - só getters
* @Setter - só setters
* */

@Data // Getters e Setters
public class UserModel {
    private String username;
    private String name;
    private String password;
}
