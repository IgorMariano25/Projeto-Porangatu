package com.example.helloworld.core;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

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

    @Column(name = "cnh", nullable =  false)
    private String cnh;

    public Motorista() {
    }

    public void setId(long id){
        this.id = id;
    }

    // TO DO getters
    // TO DO equals
    // TO DO hashCode

    // TODO: Adicionar mensagem de exibição neste método
    @Override
    public String toString() {
        String msg = "";
        return msg;
    }
}