package com.kou.getway.controller;
import org.springframework.web.bind.annotation.*;

import com.kou.getway.service.LlmService;

record GenerateRequest(String prompt) {}
record GenerateResponse(String output) {}

@RestController
@RequestMapping("/generate")
public class GenerateController {

    private final LlmService llmService;

    public GenerateController(LlmService llmService) {
        this.llmService = llmService;
    }

    @PostMapping
    public GenerateResponse generate(@RequestBody GenerateRequest request) {
        String result = llmService.generate(request.prompt());
        return new GenerateResponse(result);
    }
}