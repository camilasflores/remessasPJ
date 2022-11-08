package com.bradesco.remessasPJ.entidade;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Remessa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRemessa;

    @Column(name = "SEQUENCIAL", nullable = false)
    private int sequencial;

    @ManyToOne
    @JoinColumn(name = "Numero_Contrato")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "Status")
    private Status status;
}
