package com.colmena.tramite_documentario.application.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.colmena.tramite_documentario.domain.entities.UsuarioEntity;
import com.colmena.tramite_documentario.domain.repositories.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserService {
  private final UsuarioRepository userRepository;

  public UsuarioEntity getUser(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  public List<UsuarioEntity> getUsers() {
    return userRepository.findAll();
  }
}
