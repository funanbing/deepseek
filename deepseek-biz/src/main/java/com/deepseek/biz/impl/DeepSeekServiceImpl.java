package com.deepseek.biz.impl;

import com.deepseek.biz.DeepSeekService;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

/**
 * @author funanbing
 * @date 2025-01-03 13:57:20
 * @description
 */
@Service
public class DeepSeekServiceImpl implements DeepSeekService {

    @Autowired
    private OpenAiChatModel openAiChatModel;

    @Override
    public String getAiResult(String question) {
        return openAiChatModel.call(question);
    }

    @Override
    public Flux<String> generateStream(String question) {
        Message message = new UserMessage(question);
        return openAiChatModel.stream(message);
    }
}
