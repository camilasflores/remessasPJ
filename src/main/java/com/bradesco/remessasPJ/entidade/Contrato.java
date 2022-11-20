package com.bradesco.remessasPJ.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Contrato {

    @Id
    @Column(name = "ACESSORIO_ESCRITURAL", nullable = false)
    private int acessorioEscritural;

    @ManyToOne
    @JoinColumn(name = "Carteira", nullable = false)
    private Carteira carteira;

    @ManyToOne
    @JoinColumn(name = "CPF_CNPJ", nullable = false)
    private Empresa empresa;

    @Column(name = "AGENCIA", nullable = false)
    private int agencia;

    @Column(name = "CONTA", nullable = false, unique = true)
    private int conta;


}