package com.kou.getway.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kou.getway.service.LlmService;
import com.kou.getway.service.LocalStubLlmService;
import com.kou.getway.service.OpenAiLlmService;

@Configuration
public class LlmConfig {

    @Value("${llm.provider:local}") // default is local
    private String provider;

    @Bean
    public LlmService llmService(
            OpenAiLlmService openAi,
            LocalStubLlmService local
    ) {
        return switch (provider.toLowerCase()) {
            case "openai" -> openAi;
            case "local" -> local;
            default -> throw new IllegalArgumentException(
                    "Unsupported LLM provider: " + provider
            );
        };
    }
}