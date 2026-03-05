package fun.kmoon.chatmind.controller;

import fun.kmoon.chatmind.model.common.ApiResponse;
import fun.kmoon.chatmind.model.request.CreateKnowledgeBaseRequest;
import fun.kmoon.chatmind.model.request.UpdateKnowledgeBaseRequest;
import fun.kmoon.chatmind.model.response.CreateKnowledgeBaseResponse;
import fun.kmoon.chatmind.model.response.GetKnowledgeBasesResponse;
import fun.kmoon.chatmind.service.KnowledgeBaseFacadeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class KnowledgeBaseController {

    private final KnowledgeBaseFacadeService knowledgeBaseFacadeService;

    // 查询所有知识库
    @GetMapping("/knowledge-bases")
    public ApiResponse<GetKnowledgeBasesResponse> getKnowledgeBases() {
        return ApiResponse.success(knowledgeBaseFacadeService.getKnowledgeBases());
    }

    // 创建知识库
    @PostMapping("/knowledge-bases")
    public ApiResponse<CreateKnowledgeBaseResponse> createKnowledgeBase(@RequestBody CreateKnowledgeBaseRequest request) {
        return ApiResponse.success(knowledgeBaseFacadeService.createKnowledgeBase(request));
    }

    // 删除知识库
    @DeleteMapping("/knowledge-bases/{knowledgeBaseId}")
    public ApiResponse<Void> deleteKnowledgeBase(@PathVariable String knowledgeBaseId) {
        knowledgeBaseFacadeService.deleteKnowledgeBase(knowledgeBaseId);
        return ApiResponse.success();
    }

    // 更新知识库
    @PatchMapping("/knowledge-bases/{knowledgeBaseId}")
    public ApiResponse<Void> updateKnowledgeBase(@PathVariable String knowledgeBaseId, @RequestBody UpdateKnowledgeBaseRequest request) {
        knowledgeBaseFacadeService.updateKnowledgeBase(knowledgeBaseId, request);
        return ApiResponse.success();
    }
}
