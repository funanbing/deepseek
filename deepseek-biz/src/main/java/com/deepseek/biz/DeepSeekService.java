package com.deepseek.biz;

import org.springframework.ai.chat.model.ChatResponse;
import reactor.core.publisher.Flux;

/**
 * @author funanbing
 * @date 2025-01-03 13:57:04
 * @description
 */
public interface DeepSeekService {

    /**
     * 获取结果
     * @param question
     * @return
     */
    String getAiResult(String question);

    /**
     * 获取流式结果
     * @param question
     * @return
     */
    Flux<String> generateStream(String question);
}
