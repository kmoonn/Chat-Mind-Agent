package fun.kmoon.chatmind.service;

import fun.kmoon.chatmind.model.request.CreateChatSessionRequest;
import fun.kmoon.chatmind.model.request.UpdateChatSessionRequest;
import fun.kmoon.chatmind.model.response.CreateChatSessionResponse;
import fun.kmoon.chatmind.model.response.GetChatSessionResponse;
import fun.kmoon.chatmind.model.response.GetChatSessionsResponse;

public interface ChatSessionFacadeService {
    GetChatSessionsResponse getChatSessions();

    GetChatSessionResponse getChatSession(String chatSessionId);

    GetChatSessionsResponse getChatSessionsByAgentId(String agentId);

    CreateChatSessionResponse createChatSession(CreateChatSessionRequest request);

    void deleteChatSession(String chatSessionId);

    void updateChatSession(String chatSessionId, UpdateChatSessionRequest request);
}
