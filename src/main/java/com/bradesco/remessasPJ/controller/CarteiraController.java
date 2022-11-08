package com.bradesco.remessasPJ.controller;

import com.bradesco.remessasPJ.entidade.Carteira;
import com.bradesco.remessasPJ.service.CarteiraService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carteiras")
public class CarteiraController {

    private CarteiraService carteiraService;

    public CarteiraController(CarteiraService carteiraService) {
        this.carteiraService = carteiraService;
    }

    @PostMapping
    public Carteira addRemessa(@RequestBody Carteira carteira){
        return carteiraService.novaCarteira(carteira);
    }

    @GetMapping
    public List<Carteira> obterTodas(){
        return carteiraService.buscarTodas();
    }

}
