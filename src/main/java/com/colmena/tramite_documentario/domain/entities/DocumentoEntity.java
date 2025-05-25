package com.colmena.tramite_documentario.domain.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

@Table(name = "documento", schema = "public")
public class DocumentoEntity {
  @Id
  private String hash;
  private String name;
  private Date createAt;
}
