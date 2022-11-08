package com.bradesco.remessasPJ.controller;

import com.bradesco.remessasPJ.entidade.Remessa;
import com.bradesco.remessasPJ.service.RemessaService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/remessas")
public class RemessaController {

    private RemessaService remessaService;

    public RemessaController(RemessaService remessaService) {
        this.remessaService = remessaService;
    }

    @PostMapping
    public Remessa addRemessa(@RequestBody Remessa remessa){
        return remessaService.novaRemessa(remessa);
    }

    @GetMapping
    public List<Remessa> obterTodas(){
        return remessaService.buscarTodas();
    }

}
