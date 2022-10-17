package com.example.helloworld.core;

/*
 POJO - Plain Old Java Object
 POJO - Não extende de outra classe
 POJO - Não implementa interfaces
 POJO - Não tem notações externas
 */

public class DispositivoPOJO {

    int quantidadeSensores;
    String nomeMotoristaResponsavel;

    public DispositivoPOJO(int quantidadeSensores, String nomeMotoristaResponsavel) {
        this.quantidadeSensores = quantidadeSensores;
        this.nomeMotoristaResponsavel = nomeMotoristaResponsavel;
    }

    public int getQuantidadeSensores() {
        return this.quantidadeSensores;
    }

    public void setQuantidadeSensores(int quantidadeSensores) {
        this.quantidadeSensores = quantidadeSensores;
    }

    public String getNomeMotoristaResponsavel() {
        return this.nomeMotoristaResponsavel;
    }

    public void setNomeMotoristaResponsavel(String nomeMotoristaResponsavel) {
        this.nomeMotoristaResponsavel = nomeMotoristaResponsavel;
    }
}
