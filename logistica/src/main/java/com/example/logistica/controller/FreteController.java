package com.example.logistica.controller;

import com.example.logistica.model.EntregaRequest;
import com.example.logistica.model.EntregaResponse;
import com.example.logistica.service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/frete")
public class FreteController {

    @Autowired
    private FreteService freteService;

    @PostMapping("/calcular")
    public EntregaResponse calcular(@RequestBody EntregaRequest request) {
        return freteService.calcularFrete(request);
    }
}
