package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Remessa;
import com.bradesco.remessasPJ.entidade.Status;
import com.bradesco.remessasPJ.repository.RemessaRepository;
import com.bradesco.remessasPJ.repository.StatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

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

    public void deletarStatus(int id){
        statusRepository.deleteById(id);
    }

    public Status alterarStatus(int id, Status status){
        var statusOptional = statusRepository.findById(id);
        if (statusOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        status.setIdStatus(id);
        return statusRepository.save(status);
    }

}

