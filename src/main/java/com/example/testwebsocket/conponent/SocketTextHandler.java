package com.example.testwebsocket.conponent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketTextHandler extends TextWebSocketHandler {

    private Integer count = 0;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        //接收过来的
        logger.info("receive message : {}",message.getPayload());

        count++;

        //发送过去
        session.sendMessage(new TextMessage("the count is "+count));

    }
}
