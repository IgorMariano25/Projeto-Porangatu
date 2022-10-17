package com.example.helloworld.core;

/*
 POJO - Plain Old Java Object
 POJO - Não extende de outra classe
 POJO - Não implementa interfaces
 POJO - Não tem notações externas
 */

public class VeiculoPOJO {
    
    String placaVeiculo;
    String tipo;
    String modelo;
    String motorista;

    public VeiculoPOJO(String placa, String tipo, String modelo, String motorista) {
        this.placa = placa;
        this.tipo = tipo;
        this.modelo = modelo;
        this.motorista = motorista;
    }
}
