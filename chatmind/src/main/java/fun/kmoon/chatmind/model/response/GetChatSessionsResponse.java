package fun.kmoon.chatmind.model.response;

import fun.kmoon.chatmind.model.vo.ChatSessionVO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetChatSessionsResponse {
    private ChatSessionVO[] chatSessions;
}
