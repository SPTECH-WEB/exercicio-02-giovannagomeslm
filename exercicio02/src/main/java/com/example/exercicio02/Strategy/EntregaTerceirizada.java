package com.example.exercicio02.Strategy;


import com.example.exercicio02.Adapter.Transportadora;
import com.example.exercicio02.Adapter.TransportadoraExternaAdapter;
import org.springframework.stereotype.Component;

@Component ("terceirizada")
public class EntregaTerceirizada implements FreteStrategy {
    private final TransportadoraExternaAdapter adapter = new TransportadoraExternaAdapter();

    @Override
    public  double calcularFrete(double peso){
      return adapter.calcularValor(peso);
    }
}
