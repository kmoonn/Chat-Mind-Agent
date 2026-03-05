package fun.kmoon.chatmind.model.response;

import fun.kmoon.chatmind.model.vo.ChatMessageVO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetChatMessagesResponse {
    private ChatMessageVO[] chatMessages;
}

