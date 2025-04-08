package com.example.exercicio02.Adapter;

public class TransportadoraExternaAdapter {

    private TransportadoraExternaAPI api =new TransportadoraExternaAPI();

    public double calcularValor(double peso){
        return api.calcularPrecoComPeso(peso);
    }
}
