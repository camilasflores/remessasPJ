package com.bradesco.remessasPJ.entidade;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Empresa {

    @Column(name = "RAZAO_SOCIAL", nullable = false)
    private String razaoSocial;

    @Id
    @Column(name = "CPF_CNPJ", nullable = false, unique = true)
    private String CPF_CNPJ;

}

