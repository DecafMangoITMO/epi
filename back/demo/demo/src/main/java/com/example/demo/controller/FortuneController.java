package com.example.fortune.controller;

import com.example.fortune.model.FortuneResponse;
import com.example.fortune.service.FortuneService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fortune-telling")
public class FortuneController {

    private final FortuneService fortuneService;

    public FortuneController(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @PostMapping("/{type}")
    public FortuneResponse tellFortune(@PathVariable String type) {
        return fortuneService.getFortune(type);
    }
}
