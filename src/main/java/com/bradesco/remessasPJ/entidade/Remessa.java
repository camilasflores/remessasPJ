package com.bradesco.remessasPJ.entidade;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;

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
    private List<Contrato> contratos;

    @ManyToOne
    @JoinColumn(name = "Status")
    private List<Status> status;

    public Remessa() {
    }

    public Remessa(Integer idRemessa, int sequencial, List<Contrato> contratos, List<Status> status) {
        this.idRemessa = idRemessa;
        this.sequencial = sequencial;
        this.contratos = contratos;
        this.status = status;
    }
}
