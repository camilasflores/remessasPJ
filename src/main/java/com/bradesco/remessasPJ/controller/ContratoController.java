package com.bradesco.remessasPJ.controller;


import com.bradesco.remessasPJ.entidade.Contrato;
import com.bradesco.remessasPJ.service.ContratoService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    private ContratoService contratoService;

    public ContratoController(ContratoService contratoService) {
        this.contratoService = contratoService;
    }

    @PostMapping
    public Contrato addContrato(@RequestBody Contrato contrato){
        return contratoService.novoContrato(contrato);
    }

    @GetMapping
    public List<Contrato> obterTodos(){
        return contratoService.buscarTodos();
    }

}

