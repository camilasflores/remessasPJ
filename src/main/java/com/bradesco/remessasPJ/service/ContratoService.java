package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Carteira;
import com.bradesco.remessasPJ.entidade.Contrato;
import com.bradesco.remessasPJ.repository.ContratoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ContratoService {
    private ContratoRepository contratoRepository;

    public ContratoService(ContratoRepository contratoRepository){

        this.contratoRepository = contratoRepository;
    }

    public Contrato novoContrato(Contrato contrato){

        Contrato contratoSalvo = contratoRepository.save(contrato);
        return contratoSalvo;
    }

    public void deletarContrato(int id){
        contratoRepository.deleteById(id);
    }

    public List<Contrato> buscarTodos() {
        return contratoRepository.findAll();
    }

    public Contrato alterarContrato(int id, Contrato contrato){
        var contratoOptional = contratoRepository.findById(id);
        if (contratoOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        contrato.setAcessorioEscritural(id);
        return contratoRepository.save(contrato);
    }
}
