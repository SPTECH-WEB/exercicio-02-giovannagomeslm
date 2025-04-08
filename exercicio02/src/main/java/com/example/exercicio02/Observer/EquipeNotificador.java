package com.example.exercicio02.Observer;

import org.springframework.stereotype.Component;

@Component
public class EquipeNotificador implements Observador {
    public void notificar (String mensagem){
        System.out.println("Equipe notificada" + mensagem);
    }
}
