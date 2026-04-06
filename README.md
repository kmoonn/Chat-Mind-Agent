# Chat-Mind-Agent
智能 AI Agent 系统

基于 Spring AI 框架构建，实现了**自主决策、工具调用、知识库检索**等核心能力。

## 架构

- 应用层

会话模块

智能体模块

知识库模块

- 服务层

智能体管理

异步事件

会话管理

SSE 服务

Markdown 解析

知识库管理

RAG

工具调用

- 基础层

PostgreSQL + pgvector

Ollama 本地模型


## 原理

- Think-Execute 循环机制

多轮工具调用

- ReAct 模式

- RAG 检索

pgvector

- Embedding

- Agent Loop

- ChatMemory

- Multi-Models 多模型支持

注册表模式

解析配置文件

创建 ChatClient 对象

注入 chatClients Map 中

ChatClientRegistry 注册中心