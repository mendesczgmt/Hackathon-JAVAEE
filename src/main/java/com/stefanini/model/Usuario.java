package com.stefanini.model;

import javax.persistence.*;


@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 50)
    private String login;

    @Column(length = 15)
    private String senha;
}