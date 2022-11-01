package com.bradesco.remessasPJ.controller;

import com.bradesco.remessasPJ.entidade.Empresa;
import com.bradesco.remessasPJ.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
@RequiredArgsConstructor
public class EmpresaController {

    private final EmpresaService empresaService;

    @PostMapping
    public Empresa addEmpresa(@RequestBody Empresa empresa){
        Empresa empresaCadastrada = empresaService.novaEmpresa(empresa);
        return empresaCadastrada;
    }
}
