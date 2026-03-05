package fun.kmoon.chatmind.agent.tools;

public interface Tool {
    String getName();

    String getDescription();

    ToolType getType();
}
