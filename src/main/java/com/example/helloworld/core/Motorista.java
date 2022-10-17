package com.example.helloworld.core;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.Objects;

@Entity
@Table(name = "Motorista")
@NamedQuery(
    name = "com.example.helloworld.core.Motorista.findAll",
    query = "SELECT m FROM m"
)
public class Motorista {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
}
