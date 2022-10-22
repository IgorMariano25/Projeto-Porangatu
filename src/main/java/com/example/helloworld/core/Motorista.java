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

    @Column(name = "cnh", nullable =  false)
    private String cnh;

    public Motorista() {
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Motorista)) {
            return false;
        }
        Motorista motorista = (Motorista) o;
        return id == motorista.id && Objects.equals(cnh, motorista.cnh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cnh);
    }
    // TODO: Adicionar mensagem de exibição neste método
    @Override
    public String toString() {
        String msg = "";
        return msg;
    }
}