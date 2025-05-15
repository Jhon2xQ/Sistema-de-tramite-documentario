package com.colmena.tramite_documentario.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.colmena.tramite_documentario.Entities.UsuarioEntity;
import com.colmena.tramite_documentario.Services.UserService;

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
