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
@Table(name = "Dispositivo")
@NamedQuery(
    name = "com.example.helloworld.core.Dispositivo.findAll",
    query = "SELECT d FROM d"
)
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // TO DO
    @column(name = "", nullable =  false)
    @column(name = "", nullable =  false)
    @column(name = "", nullable =  false)

    // TO DO getters
    // TO DO equals

    public Dispositivo() {
    }

    public void setId(long id){
        this.id = id;
    }

    @Override
    public String toString() {
        String msg = "";
        return msg;
    }
}
