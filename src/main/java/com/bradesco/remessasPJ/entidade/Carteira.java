package com.bradesco.remessasPJ.entidade;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Carteira {

    @Id
    @Column(name = "COD_CARTEIRA")
    private int codCarteira;

    @Column(name = "DESCRIÇÃO", nullable = false)
    private String descricao;

    public Carteira() {
    }

    public Carteira(int codCarteira, String descricao) {
        this.codCarteira = codCarteira;
        this.descricao = descricao;
    }
}
