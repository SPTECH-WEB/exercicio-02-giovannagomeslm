package com.example.exercicio02.Controller;

import com.example.exercicio02.Service.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entregar")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    @GetMapping
    public String entregar(@RequestParam double peso) {
        return entregaService.processarEntrega(peso);
    }
}
