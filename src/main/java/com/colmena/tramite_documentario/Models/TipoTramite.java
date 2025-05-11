package com.colmena.tramite_documentario.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TipoTramite {
  @Id
  private Long id;
  private String nombre;
  private String grupo;
  private Double costo;
}
