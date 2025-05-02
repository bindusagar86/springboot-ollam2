package com.bbtech.controller;

import com.bbtech.service.AIOllamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AIController {

    @Autowired
    private AIOllamaService aiOllamaService;

    @GetMapping("/generate")
    public String generatePrompt(@RequestParam String message) {
        return aiOllamaService.generatePrompt(message);
    }
}
