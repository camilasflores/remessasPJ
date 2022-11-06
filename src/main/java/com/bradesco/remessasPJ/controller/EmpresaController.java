package com.bradesco.remessasPJ.controller;

import com.bradesco.remessasPJ.entidade.Empresa;
import com.bradesco.remessasPJ.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")

@Service
public class EmpresaController {

    private EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping
    public Empresa addEmpresa(@RequestBody Empresa empresa){
        return empresaService.novaEmpresa(empresa);
    }

    @GetMapping
    public List<Empresa> obterTodas(){
        return empresaService.buscarTodas();
    }

}
