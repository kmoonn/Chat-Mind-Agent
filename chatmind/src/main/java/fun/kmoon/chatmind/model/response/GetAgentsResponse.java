package fun.kmoon.chatmind.model.response;

import fun.kmoon.chatmind.model.vo.AgentVO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetAgentsResponse {
    private AgentVO[] agents;
}
