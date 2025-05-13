package com.colmena.tramite_documentario.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.colmena.tramite_documentario.Models.Usuario;
import com.colmena.tramite_documentario.Repositories.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserService {
  private final UsuarioRepository userRepository;

  public Usuario getUser(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  public List<Usuario> getUsers() {
    return userRepository.findAll();
  }
}
