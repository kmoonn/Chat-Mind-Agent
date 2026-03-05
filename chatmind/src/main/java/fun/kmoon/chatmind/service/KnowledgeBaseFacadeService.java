package fun.kmoon.chatmind.service;

import fun.kmoon.chatmind.model.request.CreateKnowledgeBaseRequest;
import fun.kmoon.chatmind.model.request.UpdateKnowledgeBaseRequest;
import fun.kmoon.chatmind.model.response.CreateKnowledgeBaseResponse;
import fun.kmoon.chatmind.model.response.GetKnowledgeBasesResponse;

public interface KnowledgeBaseFacadeService {
    GetKnowledgeBasesResponse getKnowledgeBases();

    CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request);

    void deleteKnowledgeBase(String knowledgeBaseId);

    void updateKnowledgeBase(String knowledgeBaseId, UpdateKnowledgeBaseRequest request);
}

