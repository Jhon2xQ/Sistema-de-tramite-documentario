package com.colmena.tramite_documentario.domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

@Table(name = "usuario", schema = "public")
public class UsuarioEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String username;
  private String password;
  private String publicKey;
  private String privateKey;

  @ManyToOne()
  @JoinColumn(name = "persona")
  private PersonaEntity persona;

  @ManyToOne()
  @JoinColumn(name = "rol")
  private RolEntity rol;
}
