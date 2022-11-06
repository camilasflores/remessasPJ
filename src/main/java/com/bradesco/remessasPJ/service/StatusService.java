package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Remessa;
import com.bradesco.remessasPJ.entidade.Status;
import com.bradesco.remessasPJ.repository.RemessaRepository;
import com.bradesco.remessasPJ.repository.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    private StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository){

        this.statusRepository = statusRepository;
    }

    public Status novoStatus(Status status){

        Status statusSalvo = statusRepository.save(status);
        return statusSalvo;
    }

    public List<Status> buscarTodas() {
        return statusRepository.findAll();
    }
}
