package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Contrato;
import com.bradesco.remessasPJ.entidade.Remessa;
import com.bradesco.remessasPJ.entidade.Status;
import com.bradesco.remessasPJ.repository.RemessaRepository;
import com.bradesco.remessasPJ.repository.StatusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RemessaService {
    private RemessaRepository remessaRepository;
    private StatusRepository statusRepository;

    public RemessaService(RemessaRepository remessaRepository, StatusRepository statusRepository) {

        this.remessaRepository = remessaRepository;
        this.statusRepository = statusRepository;
    }

    public Remessa novaRemessa(Remessa remessa) {
        //setar o status em processamento e não manda mais no postman
        Status status = statusRepository.findStatusByNumero(1);
        remessa.setStatus(status);
        Remessa remessaSalva = remessaRepository.save(remessa);
        return remessaSalva;
    }

    public List<Remessa> buscarTodas() {
        return remessaRepository.findAll();
    }
    public Remessa findById(Integer idRemessa){
        return remessaRepository.findById(idRemessa).orElseThrow();
    }

    public void deletarRemessa(int id) {
        remessaRepository.deleteById(id);
    }

    public Remessa alterarRemessa(Integer id, Remessa remessa) {
        var remessaOptional = remessaRepository.findById(id);
        if (remessaOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        remessa.setIdRemessa(id);
        return remessaRepository.save(remessa);
    }

    public Remessa analiseSequencial(Remessa remessa, String sequencial){
        var procuraSequencial = remessaRepository.findBySequencial(sequencial);
        if (procuraSequencial.isPresent()){
            //sequencial inválido
            var status = statusRepository.findStatusByNumero(2);
            remessa.setStatus(status);
        }
        else {
            //processado
            var status = statusRepository.findStatusByNumero(3);
            remessa.setSequencial(sequencial);
            remessa.setStatus(status);
        }
        return remessa;
    }

}

