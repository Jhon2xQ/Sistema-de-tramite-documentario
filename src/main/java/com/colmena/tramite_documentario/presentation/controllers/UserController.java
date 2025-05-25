package com.colmena.tramite_documentario.presentation.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.colmena.tramite_documentario.application.services.UserService;
import com.colmena.tramite_documentario.domain.entities.UsuarioEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")

public class UserController {
  private final UserService userService;

  @GetMapping()
  public List<UsuarioEntity> getUsers() {
    return userService.getUsers();
  }
}
