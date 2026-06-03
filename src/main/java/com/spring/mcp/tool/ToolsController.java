package com.spring.mcp.tool;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class ToolsController {

    @Tool(description = "Say hello to the user")
    public String sayHello() {
        return "Hello World!";
    }
}
