package com.colmena.tramite_documentario.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colmena.tramite_documentario.Models.TipoTramite;

@Repository
public interface TipoTramiteRepository extends JpaRepository<TipoTramite, Long> {
  
}
