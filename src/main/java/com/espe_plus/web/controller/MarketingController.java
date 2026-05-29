package com.espe_plus.web.controller;

import com.espe_plus.domain.service.EduSmartAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketingController {

    private final EduSmartAIService eduSmartAIService;

    public MarketingController(EduSmartAIService eduSmartAIService) {
        this.eduSmartAIService = eduSmartAIService;
    }

    @GetMapping("/api/edusmart/publicidad")
    public String generarPublicidad(
            @RequestParam("tema") String tema,
            @RequestParam("audiencia") String audiencia
    ) {
        return eduSmartAIService.generarPublicidad(tema, audiencia);
    }
}