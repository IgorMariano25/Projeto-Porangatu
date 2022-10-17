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
@Table(name = "Veiculo")
@NamedQuery(
    name = "com.example.helloword.core.Veiculo.findAll",
    query = "SELECT v FROM v"
)
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // TO DO - nomear coluna das tabelas
    @column(name = "", nullable =  false)
    @column(name = "", nullable =  false)
    @column(name = "", nullable =  false)


    public Veiculo() {
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
