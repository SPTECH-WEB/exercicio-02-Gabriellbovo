package com.example.logistica.service;

import com.example.logistica.strategy.*;
import com.example.logistica.adapter.FreteTransportadoraExterna;
import com.example.logistica.model.EntregaRequest;
import com.example.logistica.model.EntregaResponse;
import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public EntregaResponse calcularFrete(EntregaRequest request) {
        FreteStrategy strategy;

        switch (request.getModalidade().toLowerCase()) {
            case "expressa":
                strategy = new FreteExpressa();
                break;
            case "economica":
                strategy = new FreteEconomica();
                break;
            case "terceirizada":
                strategy = new TransportadoraTerceirizadaStrategy(); // Adapter
                break;
            default:
                throw new IllegalArgumentException("Modalidade inválida");
        }

        double valor = strategy.calcularFrete(request.getPeso());

        return new EntregaResponse(valor, "Entrega processada com sucesso!");
    }
}
