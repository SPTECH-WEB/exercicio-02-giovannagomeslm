package com.example.exercicio02.Service;

import com.example.exercicio02.Observer.Entrega;
import com.example.exercicio02.Observer.Observador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregaService {

    @Autowired
    private Entrega entrega;

    public String processarEntrega(double peso) {
        // Aqui você colocaria o cálculo do frete e qualquer outra lógica
        // Simulando a entrega sendo feita
        entrega.concluirEntrega();
        return "Entrega realizada com sucesso!";
    }
}
