package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Empresa;
import com.bradesco.remessasPJ.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    private EmpresaRepository empresaRepository;
    public EmpresaService(EmpresaRepository empresaRepository){

        this.empresaRepository = empresaRepository;
    }

    public Empresa novaEmpresa(Empresa empresa){

        Empresa empresaSalva = empresaRepository.save(empresa);
        return empresaSalva;
    }
}
