package com.example.logistica.strategy;

public class FreteEconomica implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 1.5;
    }
}
