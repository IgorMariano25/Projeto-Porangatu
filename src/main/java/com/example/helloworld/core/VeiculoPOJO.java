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

    public VeiculoPOJO(String placaVeiculo, String tipoVeiculo, String modeloVeiculo, String motorista) {
        this.placaVeiculo = placaVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.motorista = motorista;
    }
}
