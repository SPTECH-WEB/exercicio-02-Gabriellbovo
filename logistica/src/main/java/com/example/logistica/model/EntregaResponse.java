package com.example.logistica.model;

public class EntregaResponse {
    private double valorFrete;
    private String mensagem;

    public EntregaResponse(double valorFrete, String mensagem) {
        this.valorFrete = valorFrete;
        this.mensagem = mensagem;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public String getMensagem() {
        return mensagem;
    }
}
