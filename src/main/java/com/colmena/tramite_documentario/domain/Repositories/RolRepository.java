package com.colmena.tramite_documentario.domain.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colmena.tramite_documentario.domain.Entities.RolEntity;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Long> {
  
}
