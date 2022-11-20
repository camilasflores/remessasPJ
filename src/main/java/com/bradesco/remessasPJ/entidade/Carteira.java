package com.bradesco.remessasPJ.entidade;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Carteira {

    @Id
    @Column(name = "COD_CARTEIRA")
    private int codCarteira;

    @Column(name = "DESCRIÇÃO", nullable = false)
    private String descricao;

}
