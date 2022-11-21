package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Carteira;
import com.bradesco.remessasPJ.repository.CarteiraRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CarteiraService {

    private CarteiraRepository carteiraRepository;

    public CarteiraService(CarteiraRepository carteiraRepository){

        this.carteiraRepository = carteiraRepository;
    }

    public Carteira novaCarteira(Carteira carteira){

        Carteira carteiraSalva = carteiraRepository.save(carteira);
        return carteiraSalva;
    }

    public List<Carteira> buscarTodas() {
        return carteiraRepository.findAll();
    }

    public void deletarCarteira(int id) {
        carteiraRepository.deleteById(id);
    }
    public Carteira alterarCarteira(int id, Carteira carteira){
        var carteiraOptional = carteiraRepository.findById(id);
        if (carteiraOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        carteira.setCodCarteira(id);
        return carteiraRepository.save(carteira);
    }
}
