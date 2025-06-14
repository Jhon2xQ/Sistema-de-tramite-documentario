package com.colmena.tramite_documentario.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.colmena.tramite_documentario.infrastructure.services.OllamaAi.AiService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ai")
public class AiController {

  private final AiService aiService;

    @GetMapping()
    public String preguntar(@RequestParam String texto) {
        return aiService.getResponse(texto);
    }
}
