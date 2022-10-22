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

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSensores() {
        return this.sensores;
    }

    public void setSensores(String sensores) {
        this.sensores = sensores;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Dispositivo)) {
            return false;
        }
        Dispositivo dispositivo = (Dispositivo) o;
        return id == dispositivo.id && Objects.equals(tipo, dispositivo.tipo) && Objects.equals(sensores, dispositivo.sensores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, sensores);
    }

    // TODO: Adicionar mensagem de exibição neste método
    @Override
    public String toString() {
        String msg = "";
        return msg;
    }
}
