package com.colmena.tramite_documentario.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.colmena.tramite_documentario.Models.User;
import com.colmena.tramite_documentario.Repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserService {
  private final UserRepository userRepository;

  public User getUser(Long id) {
    return userRepository.findById(id).orElse(null);
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }
}
