package com.mcp.mcpservershoppinglist;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class McpServerShoppingListApplication {

    public static void main(String[] args) {
        SpringApplication.run(McpServerShoppingListApplication.class, args);
    }

    @Bean
    public List<ToolCallback> tools(ShoppingCart shoppingCart) {
        return List.of(ToolCallbacks.from(shoppingCart));
    }

}
