package fun.kmoon.chatmind.mapper;

import fun.kmoon.chatmind.model.entity.ChatSession;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author charon
 * @description 针对表【chat_session】的数据库操作Mapper
 * @createDate 2025-12-02 14:52:46
 * @Entity entity.model.fun.kmoon.chatmind.ChatSession
 */
@Mapper
public interface ChatSessionMapper {
    int insert(ChatSession chatSession);

    ChatSession selectById(String id);

    List<ChatSession> selectAll();

    List<ChatSession> selectByAgentId(String agentId);

    int deleteById(String id);

    int updateById(ChatSession chatSession);
}
