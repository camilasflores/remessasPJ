package com.bradesco.remessasPJ.controller;

import com.bradesco.remessasPJ.entidade.Empresa;
import com.bradesco.remessasPJ.entidade.Remessa;
import com.bradesco.remessasPJ.service.RemessaService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
    @DeleteMapping("/{id}")
    public void removeRemessa(@PathVariable int id){
        remessaService.deletarRemessa(id);
    }

    @PutMapping ("/{id}")
    public Remessa atualizaPorId(@PathVariable int id, @RequestBody Remessa remessa){
        return remessaService.alterarRemessa(id, remessa);

    }

    @PostMapping ("/arquivo/{idRemessa}") //passar o id da remessa no parametro
    public Remessa recebeArquivo(@RequestParam("remessa") MultipartFile arquivoRemessa, @PathVariable Integer idRemessa){
        List<String> data = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(arquivoRemessa.getInputStream()))) {
           data = reader.lines().toList();
           String sequencial = data.get(0).substring(0,7);
           Remessa remessa = remessaService.findById(idRemessa);
           remessaService.analiseSequencial(remessa, sequencial);
           return remessaService.alterarRemessa(idRemessa, remessa);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
