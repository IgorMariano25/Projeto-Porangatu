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
    String motorista;

    public VeiculoPOJO(String placaVeiculo, String tipoVeiculo, String modelo, String motorista) {
        this.placaVeiculo = placaVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
        this.motorista = motorista;
    }
}
