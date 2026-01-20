package com.kafka.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long idUser;
    private String firstName;
    private String lastName;
    private String email;


}
