package com.example.helloworld.core;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Id;

@Entity
@Table(name = "Dispositivo")
@NamedQuery(
    name = "com.example.helloworld.core.Dispositivo.findAll",
    query = "SELECT d FROM d"
)
public class Dispositivo {
    

    public Dispositivo() {
    }

}
