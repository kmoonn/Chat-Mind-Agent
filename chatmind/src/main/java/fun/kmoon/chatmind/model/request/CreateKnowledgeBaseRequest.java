package fun.kmoon.chatmind.model.request;

import lombok.Data;

@Data
public class CreateKnowledgeBaseRequest {
    private String name;
    private String description;
}

