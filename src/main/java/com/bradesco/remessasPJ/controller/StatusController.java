package com.bradesco.remessasPJ.controller;

import com.bradesco.remessasPJ.entidade.Status;
import com.bradesco.remessasPJ.service.StatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    private StatusService statusService;

    public StatusController(StatusService remessaService) {
        this.statusService = remessaService;
    }

    @PostMapping
    public Status addStatus(@RequestBody Status status){
        return statusService.novoStatus(status);
    }

    @GetMapping
    public List<Status> obterTodas(){
        return statusService.buscarTodas();
    }

    @DeleteMapping("/{id}")
    public void removeStatus(@PathVariable int id){
        statusService.deletarStatus(id);
    }

    @PutMapping ("/{id}")
    public Status atualizaPorId(@PathVariable int id, @RequestBody Status status){
        return statusService.alterarStatus(id, status);
    }
}
