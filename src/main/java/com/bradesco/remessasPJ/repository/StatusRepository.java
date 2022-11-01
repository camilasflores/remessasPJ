package com.bradesco.remessasPJ.repository;

import com.bradesco.remessasPJ.entidade.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
