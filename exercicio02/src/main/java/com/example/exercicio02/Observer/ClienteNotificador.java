package com.example.exercicio02.Observer;

import org.springframework.stereotype.Component;

public class ClienteNotificador implements Observador{
    public void notificar(String mensagem){
        System.out.println("Cliente notificado:"+ mensagem);
    }
}

