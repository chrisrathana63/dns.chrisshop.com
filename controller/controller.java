package com.chrisshop.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public String handleUpload(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "❌ File is empty!";
        }
        return "✅ Uploaded: " + file.getOriginalFilename();
    }
}
