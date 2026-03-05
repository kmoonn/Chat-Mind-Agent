package fun.kmoon.chatmind.model.request;

import fun.kmoon.chatmind.model.dto.ChatMessageDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateChatMessageRequest {
    private String agentId;
    private String sessionId;
    private ChatMessageDTO.RoleType role;
    private String content;
    private ChatMessageDTO.MetaData metadata;
}
