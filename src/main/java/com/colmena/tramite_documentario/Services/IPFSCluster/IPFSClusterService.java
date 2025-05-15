package com.colmena.tramite_documentario.Services.IPFSCluster;

import java.io.IOException;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class IPFSClusterService {
  
    public String pinearArchivo(MultipartFile archivo) throws IOException {
        // Creamos el cliente
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpPost upload = new HttpPost("http://localhost:9094/add");

            // Construimos la entidad multipart
            MultipartEntityBuilder builder = MultipartEntityBuilder.create();
            builder.addBinaryBody(
                "file",
                archivo.getBytes(),
                ContentType.DEFAULT_BINARY,
                archivo.getOriginalFilename()
            );
            upload.setEntity(builder.build());

            // Definimos el ResponseHandler
            HttpClientResponseHandler<String> responseHandler = new HttpClientResponseHandler<>() {
                @Override
                public String handleResponse(ClassicHttpResponse response) throws IOException, ParseException {
                    int status = response.getCode();
                    if (status >= 200 && status < 300) {
                        return response.getEntity() != null
                            ? EntityUtils.toString(response.getEntity())
                            : null;
                    } else {
                        throw new IOException("Unexpected response status: " + status);
                    }
                }
            };

            // Ejecutamos usando el handler para gestionar recursos automáticamente
            return httpClient.execute(upload, responseHandler);
        }
    }
}
