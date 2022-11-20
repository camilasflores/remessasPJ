package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Carteira;
import com.bradesco.remessasPJ.repository.CarteiraRepository;
import org.springframework.stereotype.Service;

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
}
