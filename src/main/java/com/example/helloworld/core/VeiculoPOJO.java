package com.example.helloworld.core;

/*
 POJO - Plain Old Java Object
 POJO - Não extende de outra classe
 POJO - Não implementa interfaces
 POJO - Não tem notações externas
 */

public class VeiculoPOJO {
    
    String placaVeiculo;
    String tipoVeiculo;
    String modeloVeiculo;
    String motoristaVeiculo;

    public VeiculoPOJO(String placaVeiculo, String tipoVeiculo, String modeloVeiculo, String motoristaVeiculo) {
        this.placaVeiculo = placaVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.motoristaVeiculo = motoristaVeiculo;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getModeloVeiculo() {
        return this.modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getMotoristaVeiculo() {
        return this.motoristaVeiculo;
    }

    public void setMotoristaVeiculo(String motoristaVeiculo) {
        this.motoristaVeiculo = motoristaVeiculo;
    }
}
