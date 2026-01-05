package com.kou.getway.service;
import org.springframework.stereotype.Service;

@Service
public class LocalStubLlmService implements LlmService {

    @Override
    public String generate(String prompt) {
        return "[Local Stub Model] Echo: " + prompt;
    }
}