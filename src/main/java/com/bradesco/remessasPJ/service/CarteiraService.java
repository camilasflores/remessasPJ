package com.bradesco.remessasPJ.service;

import com.bradesco.remessasPJ.entidade.Carteira;
import com.bradesco.remessasPJ.entidade.Contrato;
import com.bradesco.remessasPJ.repository.CarteiraRepository;
import com.bradesco.remessasPJ.repository.ContratoRepository;
import org.springframework.stereotype.Service;

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

}
