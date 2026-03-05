package fun.kmoon.chatmind.service;

import fun.kmoon.chatmind.model.request.CreateDocumentRequest;
import fun.kmoon.chatmind.model.request.UpdateDocumentRequest;
import fun.kmoon.chatmind.model.response.CreateDocumentResponse;
import fun.kmoon.chatmind.model.response.GetDocumentsResponse;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentFacadeService {
    GetDocumentsResponse getDocuments();

    GetDocumentsResponse getDocumentsByKbId(String kbId);

    CreateDocumentResponse createDocument(CreateDocumentRequest request);

    CreateDocumentResponse uploadDocument(String kbId, MultipartFile file);

    void deleteDocument(String documentId);

    void updateDocument(String documentId, UpdateDocumentRequest request);
}
