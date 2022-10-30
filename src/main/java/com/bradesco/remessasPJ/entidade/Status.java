package com.bradesco.remessasPJ.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStatus;

    @Column(name = "MOTIVO", nullable = false)
    private String motivo;

    public Status(){
    }

    public Status(Integer idStatus, String motivo) {
        this.idStatus = idStatus;
        this.motivo = motivo;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
