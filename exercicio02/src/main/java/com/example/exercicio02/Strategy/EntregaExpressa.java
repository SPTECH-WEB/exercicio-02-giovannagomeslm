package com.example.exercicio02.Strategy;

import org.springframework.stereotype.Component;

@Component("expressa")
public class EntregaExpressa implements FreteStrategy{

    @Override
    public double calcularFrete(double peso){
        return peso*10.0;
    }
}
