package com.example.exercicio02.Strategy;


import org.springframework.stereotype.Component;

@Component ("economica")
public class EntregaEconomica implements FreteStrategy {

    @Override
    public double calcularFrete(double peso){
        return peso* 5.0;
    }
}
