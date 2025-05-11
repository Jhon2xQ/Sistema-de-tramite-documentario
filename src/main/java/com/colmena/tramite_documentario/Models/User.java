package com.colmena.tramite_documentario.Models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
  @Id
  private Long id;
  private String userName;
  private String password;
  private String publicKey;
  private String privateKey;
}
