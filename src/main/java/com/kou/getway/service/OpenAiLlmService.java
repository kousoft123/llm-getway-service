package com.kou.getway.service;
import org.springframework.stereotype.Service;

@Service
public class OpenAiLlmService implements LlmService {

    @Override
    public String generate(String prompt) {
        // Mocked response (replace with real API later)
        return "[OpenAI] Response for prompt: " + prompt;
    }
}