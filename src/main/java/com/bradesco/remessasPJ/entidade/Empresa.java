package com.bradesco.remessasPJ.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Empresa {
    @Column(name = "RAZAO_SOCIAL", nullable = false)
    private String razaoSocial;
    @Column(name = "CPF_CNPJ", nullable = false, unique = true)
    private String CPF_CNPJ;

    public Empresa() {
    }

    public Empresa(String razaoSocial, String CPF_CNPJ) {
        this.razaoSocial = razaoSocial;
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

}

