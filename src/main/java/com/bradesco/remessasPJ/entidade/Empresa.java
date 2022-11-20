package com.bradesco.remessasPJ.entidade;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Empresa {

    @Column(name = "RAZAO_SOCIAL", nullable = false)
    private String razaoSocial;

    @Id
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;

}

