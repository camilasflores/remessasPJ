package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Contrato;
import com.bradesco.remessasPJ.entidade.Empresa;
import com.bradesco.remessasPJ.repository.ContratoRepository;
import com.bradesco.remessasPJ.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

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
}
