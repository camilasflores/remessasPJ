package com.bradesco.remessasPJ.entidade;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Contrato {

    @Id
    @Column(name = "ACESSORIO_ESCRITURAL", nullable = false)
    private int acessorioEscritural;

    @ManyToOne
    @JoinColumn(name = "cod_carteira")
    private Carteira carteira;

    @JoinColumn(name = "CPF_CNPJ")
    private String cpfOuCnpj;

    @Column(name = "AGENCIA", nullable = false)
    private int agencia;

    @Column(name = "CONTA", nullable = false)
    private int conta;
}