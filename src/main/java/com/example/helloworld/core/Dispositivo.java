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

    // TODO - nomear coluna das tabelas
    @Column(name = "tipo", nullable =  false)
    private String tipo;

    @Column(name = "sensores", nullable =  false)
    private String sensores;

    public Dispositivo() {
    }

    public void setId(long id){
        this.id = id;
    }
    
    public long getId() {
        return this.id;
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
