package com.deepseek.model.controller;

import com.deepseek.biz.DeepSeekService;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @author funanbing
 * @date 2025-01-03 13:54:17
 * @description
 */
@RestController
public class DeepSeekAIController {

    @Autowired
    private DeepSeekService deepSeekService;

    @GetMapping("ai/message")
    public String getAiResult(@RequestParam("question") String question){
        return deepSeekService.getAiResult(question);
    }

    @GetMapping("ai/generateStream")
    public Flux<String> generateStream(@RequestParam("question") String question){
        return deepSeekService.generateStream(question);
    }
}
