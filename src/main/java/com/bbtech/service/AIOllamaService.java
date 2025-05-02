package com.bbtech.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIOllamaService {

    @Autowired
    private OllamaChatModel chatModel;

    public String generatePrompt(String message) {
        ChatResponse response = chatModel.call(
                new Prompt(message, OllamaOptions.builder()
                        .model(OllamaModel.LLAMA3_2)
                        .temperature(0.4)
                        .build())

        );
        return response.getResult().getOutput().getText();
    }
}
