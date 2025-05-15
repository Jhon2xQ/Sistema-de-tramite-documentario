package com.colmena.tramite_documentario.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.colmena.tramite_documentario.Entities.UsuarioEntity;
import com.colmena.tramite_documentario.Repositories.UsuarioRepository;

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
