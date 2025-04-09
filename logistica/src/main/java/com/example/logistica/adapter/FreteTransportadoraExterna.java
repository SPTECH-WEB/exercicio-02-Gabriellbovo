package com.example.logistica.adapter;

import com.example.logistica.strategy.FreteStrategy;

public class FreteTransportadoraExterna implements FreteStrategy {
    private TransportadoraExternaAPI api = new TransportadoraExternaAPI();

    @Override
    public double calcularFrete(double peso) {
        return api.calculaCustoExterno(peso);
    }
}
