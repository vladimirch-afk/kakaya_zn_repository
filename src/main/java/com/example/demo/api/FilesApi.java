package com.example.demo.api;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface FilesApi {

    public void uploadFile(MultipartFile file);

    public ResponseEntity<Resource> downloadFile(String filename);
}
