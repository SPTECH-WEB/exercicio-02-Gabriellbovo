package com.example.logistica.observer;

public class NotificadorCliente implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando cliente: " + mensagem);
    }
}
