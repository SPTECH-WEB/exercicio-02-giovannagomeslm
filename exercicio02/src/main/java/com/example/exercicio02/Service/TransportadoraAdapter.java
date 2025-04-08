package com.example.exercicio02.Service;

import com.example.exercicio02.Adapter.TransportadoraExternaAPI;

public class TransportadoraAdapter {

    private TransportadoraExternaAPI api = new TransportadoraExternaAPI();
    public double calcularValor(double peso){
    return  api.calcularPrecoComPeso(peso);
    }
}
