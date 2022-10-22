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
@Table(name = "administrador")
@NamedQuery(
    name = "com.example.helloworld.core.Administrador.findAll",
    query = "SELECT a FROM Administrador a"
)
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "credencial", nullable = false)
    private String credencial;

    public Administrador() {
    }

    public Administrador(String credencial){
        this.credencial = credencial;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getCredencial() {
        return credencial;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Administrador)) {
            return false;
        }
        Administrador administrador = (Administrador) o;
        return id == administrador.id && 
                Objects.equals(credencial, administrador.credencial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, credencial);
    }

    @Override
    public String toString() {
        String msg = "Administrator credencial: " + this.credencial;
        return msg;
    }
}