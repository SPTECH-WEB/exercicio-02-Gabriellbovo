package com.example.logistica.observer;

public class NotificadorEquipe implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando equipe interna: " + mensagem);
    }
}
