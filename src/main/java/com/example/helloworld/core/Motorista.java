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
    private long id;

    // TO DO - nomear coluna das tabelas
    @column(name = "", nullable =  false)
    @column(name = "", nullable =  false)
    @column(name = "", nullable =  false)

    public Motorista() {
    }

    public void setId(long id){
        this.id = id;
    }

    // TO DO getters
    // TO DO equals
    // TO DO hashCode

    @Override
    public String toString() {
        String msg = "";
        return msg;
    }
}