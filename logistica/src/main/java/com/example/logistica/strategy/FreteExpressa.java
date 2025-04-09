package com.example.logistica.strategy;

public class FreteExpressa implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 3.0 + 10;
    }
}
