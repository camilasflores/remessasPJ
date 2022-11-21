package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Contrato;
import com.bradesco.remessasPJ.entidade.Remessa;
import com.bradesco.remessasPJ.repository.RemessaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RemessaService {
    private RemessaRepository remessaRepository;

    public RemessaService(RemessaRepository remessaRepository){

        this.remessaRepository = remessaRepository;
    }

    public Remessa novaRemessa(Remessa remessa){

        Remessa remessaSalva = remessaRepository.save(remessa);
        return remessaSalva;
    }

    public List<Remessa> buscarTodas() {
        return remessaRepository.findAll();
    }

    public void deletarRemessa(int id) {
        remessaRepository.deleteById(id);
    }

    public Remessa alterarRemessa(int id, Remessa remessa){
        var remessaOptional = remessaRepository.findById(id);
        if (remessaOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        remessa.setIdRemessa(id);
        return remessaRepository.save(remessa);
    }
}
