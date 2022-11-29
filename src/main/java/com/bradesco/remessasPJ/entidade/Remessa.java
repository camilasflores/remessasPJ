package com.bradesco.remessasPJ.entidade;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Remessa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRemessa;

    @Column(name = "SEQUENCIAL")
    private String sequencial;

    @ManyToOne
    @JoinColumn(name = "Contrato", nullable = false)
    private Contrato contrato;

    @ManyToOne
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

}
