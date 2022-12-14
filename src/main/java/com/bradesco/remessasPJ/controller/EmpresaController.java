package com.bradesco.remessasPJ.controller;

import com.bradesco.remessasPJ.entidade.Contrato;
import com.bradesco.remessasPJ.entidade.Empresa;
import com.bradesco.remessasPJ.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
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

    @DeleteMapping("/{cpfCnpj}")
    public void removeempresa(@PathVariable String cpfCnpj){
        empresaService.deletarEmpresa(cpfCnpj);
    }

    @PutMapping ("/{id}")
    public Empresa atualizaPorId(@PathVariable String id, @RequestBody Empresa empresa){
        return empresaService.alterarEmpresa(id, empresa);
    }
}
