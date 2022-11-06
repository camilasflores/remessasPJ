package com.bradesco.remessasPJ.entidade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Contrato {

    @Id
    @Column(name = "ACESSORIO_ESCRITURAL", nullable = false)
    private int AcessorioEscritural;
    @ManyToOne
    @JoinColumn(name = "cod_carteira")
    private List<Carteira> carteiras;

    @ManyToOne
    @JoinColumn(name = "CPF_CNPJ")
    private List<Empresa> empresas;

    @Column(name = "AGENCIA", nullable = false)
    private int agencia;

    @Column(name = "CONTA", nullable = false)
    private int conta;

    public Contrato() {
    }

    public Contrato(int acessorioEscritural, List<Carteira> carteiras, List<Empresa> empresas, int agencia, int conta) {
        AcessorioEscritural = acessorioEscritural;
        this.carteiras = carteiras;
        this.empresas = empresas;
        this.agencia = agencia;
        this.conta = conta;
    }
}