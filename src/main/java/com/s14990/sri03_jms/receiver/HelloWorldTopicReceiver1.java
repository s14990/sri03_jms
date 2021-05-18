package com.s14990.sri03_jms.receiver;

import com.s14990.sri03_jms.config.JmsConfig;
import com.s14990.sri03_jms.model.HelloMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import javax.jms.Message;
@Component
public class HelloWorldTopicReceiver1 {
    @JmsListener(destination = JmsConfig.TOPIC_HELLO_WORLD, containerFactory =
            "topicConnectionFactory")
    public void receiveHelloMessage(@Payload HelloMessage convertedMessage,
                                    @Headers MessageHeaders messageHeaders,
                                    Message message) {
        System.out.println("HelloWorldTopicReceiver1.receiveHelloMessage, message: "+convertedMessage);
    }
}
