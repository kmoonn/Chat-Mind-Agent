package fun.kmoon.chatmind.service;

import fun.kmoon.chatmind.model.request.CreateAgentRequest;
import fun.kmoon.chatmind.model.request.UpdateAgentRequest;
import fun.kmoon.chatmind.model.response.CreateAgentResponse;
import fun.kmoon.chatmind.model.response.GetAgentsResponse;

public interface AgentFacadeService {
    GetAgentsResponse getAgents();

    CreateAgentResponse createAgent(CreateAgentRequest request);

    void deleteAgent(String agentId);

    void updateAgent(String agentId, UpdateAgentRequest request);
}
