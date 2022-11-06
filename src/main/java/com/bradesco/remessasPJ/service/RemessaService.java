package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Remessa;
import com.bradesco.remessasPJ.repository.RemessaRepository;
import org.springframework.stereotype.Service;

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
}
