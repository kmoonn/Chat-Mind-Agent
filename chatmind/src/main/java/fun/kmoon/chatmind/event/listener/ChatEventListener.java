package fun.kmoon.chatmind.event.listener;

import fun.kmoon.chatmind.agent.ChatMind;
import fun.kmoon.chatmind.agent.ChatMindFactory;
import fun.kmoon.chatmind.event.ChatEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ChatEventListener {

    private final ChatMindFactory chatMindFactory;

    @Async
    @EventListener
    public void handle(ChatEvent event) {
        // 创建一个 Agent 实例处理聊天事件
        ChatMind chatMind = chatMindFactory.create(event.getAgentId(), event.getSessionId());
        chatMind.run();
    }
}
