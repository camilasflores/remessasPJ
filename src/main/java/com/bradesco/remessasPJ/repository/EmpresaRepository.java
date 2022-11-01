package com.bradesco.remessasPJ.repository;

import com.bradesco.remessasPJ.entidade.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, String> {
}
