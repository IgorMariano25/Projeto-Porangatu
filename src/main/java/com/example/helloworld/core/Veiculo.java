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

    @Column(name = "numeroPlaca", nullable =  false)
    private String numeroPlaca;

    @Column(name = "tipoVeiculo", nullable =  false)
    private String tipoVeiculo;

    @Column(name = "tipoCarga", nullable =  false)
    private String tipoCarga;


    public Veiculo() {
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public String getNumeroPlaca() {
        return this.numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getTipoCarga() {
        return this.tipoCarga;
    }

    // TODO: Adicionar mensagem de exibição neste método
    @Override
    public String toString() {
        String msg = "";
        return msg;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Veiculo)) {
            return false;
        }
        Veiculo veiculo = (Veiculo) o;
        return id == veiculo.id && 
        Objects.equals(numeroPlaca, veiculo.numeroPlaca) && 
        Objects.equals(tipoVeiculo, veiculo.tipoVeiculo) && 
        Objects.equals(tipoCarga, veiculo.tipoCarga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroPlaca, tipoVeiculo, tipoCarga);
    }
}