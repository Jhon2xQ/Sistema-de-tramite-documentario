package com.colmena.tramite_documentario.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colmena.tramite_documentario.domain.entities.TipoTramiteEntity;

@Repository
public interface TipoTramiteRepository extends JpaRepository<TipoTramiteEntity, Long> {
  
}
