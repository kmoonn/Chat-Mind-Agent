package fun.kmoon.chatmind.model.request;

import fun.kmoon.chatmind.model.dto.ChatMessageDTO;
import lombok.Data;

@Data
public class UpdateChatMessageRequest {
    private String content;
    private ChatMessageDTO.MetaData metadata;
}

