package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Carteira;
import com.bradesco.remessasPJ.entidade.Empresa;
import com.bradesco.remessasPJ.repository.EmpresaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
    public Empresa alterarEmpresa(String id, Empresa empresa){
        var empresaOptional = empresaRepository.findById(id);
        if (empresaOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        empresa.setCpfCnpj(id);
        return empresaRepository.save(empresa);
    }
}
