package com.example.helloworld.core;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name = "Administrador")
@NamedQuery(
    name = "com.example.helloworld.core.Administrador.findAll",
    query = "SELECT a FROM a"
)
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstname", nullable = false)
    private String firstname;
}
