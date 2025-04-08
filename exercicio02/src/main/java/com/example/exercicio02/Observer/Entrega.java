package com.example.exercicio02.Observer;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Entrega {

    private List<Observador> observadores = new ArrayList<>();

    @Autowired
    private EquipeNotificador equipeNotificador;

    @PostConstruct
    public void init() {
        adicionarObservador(equipeNotificador);
    }

    public void adicionarObservador(Observador obs){
        observadores.add(obs);
    }

    public void concluirEntrega(){
        for(Observador obs : observadores){
            obs.notificar("Entrega Concluída");
        }
    }
}
