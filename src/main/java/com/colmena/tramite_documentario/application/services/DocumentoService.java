package com.colmena.tramite_documentario.application.services;

import java.util.Date;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.colmena.tramite_documentario.domain.entities.DocumentoEntity;
import com.colmena.tramite_documentario.domain.repositories.DocumentoRepository;
import com.colmena.tramite_documentario.infrastructure.services.IPFSCluster.IPFSClusterService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class DocumentoService {

  private final DocumentoRepository documentoRepository;
  private final IPFSClusterService ipfsService;
  
  public DocumentoEntity getDocumento(String id) {
    return documentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Documento no encontrado"));
  }

  public String guardarDocumento(MultipartFile archivo) throws Exception {
    String respuestaIPFS = ipfsService.pinearArchivo(archivo);
    JSONObject json = new JSONObject(respuestaIPFS);
    String cid = json.getString("cid");

    DocumentoEntity doc = new DocumentoEntity();
    doc.setHash(cid);
    doc.setName(archivo.getOriginalFilename());
    doc.setCreateAt(new Date());
    documentoRepository.save(doc);

    return cid;
  }
}
  