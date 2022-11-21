package com.bradesco.remessasPJ.controller;

import com.bradesco.remessasPJ.entidade.Carteira;
import com.bradesco.remessasPJ.entidade.Status;
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
    public Carteira addCarteira(@RequestBody Carteira carteira){
        return carteiraService.novaCarteira(carteira);
    }

    @GetMapping
    public List<Carteira> obterTodas(){
        return carteiraService.buscarTodas();
    }

    @DeleteMapping("/{id}")
    public void removeCarteira(@PathVariable int id){
        carteiraService.deletarCarteira(id);
    }

    @PutMapping ("/{id}")
    public Carteira atualizaPorId(@PathVariable int id, @RequestBody Carteira carteira){
        return carteiraService.alterarCarteira(id, carteira);
    }
}
