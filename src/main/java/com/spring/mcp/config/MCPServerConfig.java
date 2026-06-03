package com.spring.mcp.config;


import com.spring.mcp.tool.ToolsController;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MCPServerConfig {

    @Bean
    public ToolCallbackProvider todoManagementToolCallbackProvider(ToolsController toolsController) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(toolsController)
                .build();
    }

}
