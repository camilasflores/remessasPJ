package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Empresa;
import com.bradesco.remessasPJ.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;
    public EmpresaService(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    public Empresa novaEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> buscarTodas(){
        return empresaRepository.findAll();
    }

    public void deletarEmpresa(String cpfCnpj){
        empresaRepository.deleteById(cpfCnpj);
    }

}
