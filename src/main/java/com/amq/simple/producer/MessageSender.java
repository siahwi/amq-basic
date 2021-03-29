package com.amq.simple.producer;

import com.amq.simple.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    JmsTemplate jmsTemplate;
    @Value("${activemq.queue}")
    String queue;

    public void sendMessage(final Product product) {
        jmsTemplate.convertAndSend(queue, product);
    }
}
