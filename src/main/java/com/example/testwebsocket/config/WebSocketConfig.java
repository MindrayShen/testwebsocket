package com.example.testwebsocket.config;

import com.example.testwebsocket.conponent.SocketTextHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistration;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        //对应一个路径当你连接到 /user 的时候就会自动连接这个处理函数   而且可以加很多参数  不定长的
        WebSocketHandlerRegistration webSocketHandlerRegistration = webSocketHandlerRegistry.addHandler(new SocketTextHandler(), "/user");
        //跨域
        webSocketHandlerRegistration.setAllowedOrigins("*");

    }
}
