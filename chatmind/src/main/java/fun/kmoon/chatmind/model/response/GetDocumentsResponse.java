package fun.kmoon.chatmind.model.response;

import fun.kmoon.chatmind.model.vo.DocumentVO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetDocumentsResponse {
    private DocumentVO[] documents;
}

