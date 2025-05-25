package com.colmena.tramite_documentario.delivery.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.colmena.tramite_documentario.application.Services.DocumentoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/documento")
public class DocumentoController {

  private final DocumentoService documentoService;

  @PostMapping("/subir")
  public ResponseEntity<String> subirDocumento(@RequestParam("archivo") MultipartFile archivo) {
    try {
      String cid = documentoService.guardarDocumento(archivo);
      return ResponseEntity.ok("CID: " + cid);
    } catch (Exception e) {
      return ResponseEntity.internalServerError().body("Error: " + e.getMessage());
    }
  }
}
