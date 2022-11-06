package com.bradesco.remessasPJ.repository;

import com.bradesco.remessasPJ.entidade.Remessa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemessaRepository extends JpaRepository<Remessa, Integer> {
}
