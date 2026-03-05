package fun.kmoon.chatmind.service;

import fun.kmoon.chatmind.model.dto.ChatMessageDTO;
import fun.kmoon.chatmind.model.request.CreateChatMessageRequest;
import fun.kmoon.chatmind.model.request.UpdateChatMessageRequest;
import fun.kmoon.chatmind.model.response.CreateChatMessageResponse;
import fun.kmoon.chatmind.model.response.GetChatMessagesResponse;

import java.util.List;

public interface ChatMessageFacadeService {
    GetChatMessagesResponse getChatMessagesBySessionId(String sessionId);

    List<ChatMessageDTO> getChatMessagesBySessionIdRecently(String sessionId, int limit);

    CreateChatMessageResponse createChatMessage(CreateChatMessageRequest request);

    CreateChatMessageResponse createChatMessage(ChatMessageDTO chatMessageDTO);

    CreateChatMessageResponse agentCreateChatMessage(CreateChatMessageRequest request);

    CreateChatMessageResponse appendChatMessage(String chatMessageId, String appendContent);

    void deleteChatMessage(String chatMessageId);

    void updateChatMessage(String chatMessageId, UpdateChatMessageRequest request);
}
