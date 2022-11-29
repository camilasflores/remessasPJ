package com.bradesco.remessasPJ.repository;

import com.bradesco.remessasPJ.entidade.Remessa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RemessaRepository extends JpaRepository<Remessa, Integer> {
    Optional<Remessa> findBySequencial(String sequencial);

}
