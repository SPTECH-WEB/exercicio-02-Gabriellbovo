package com.example.logistica.strategy;

import com.example.logistica.adapter.FreteTransportadoraExterna;

public class TransportadoraTerceirizadaStrategy implements FreteStrategy {

    private FreteTransportadoraExterna adapter;

    public TransportadoraTerceirizadaStrategy() {
        this.adapter = new FreteTransportadoraExterna();
    }

    @Override
    public double calcularFrete(double peso) {
        return adapter.calcularFrete(peso);
    }
}
