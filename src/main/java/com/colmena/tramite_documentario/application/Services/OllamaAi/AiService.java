package com.colmena.tramite_documentario.application.Services.OllamaAi;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class AiService {

  private final OllamaChatModel ollamaChatModel;
  
  public String getResponse(String prompt) {
    return ollamaChatModel.call(prompt);
  }
}
