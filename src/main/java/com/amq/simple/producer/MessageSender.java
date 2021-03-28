package com.amq.simple.producer;

import com.amq.simple.config.MessageConfiguration;
import com.amq.simple.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    JmsTemplate jmsTemplate;

    public void sendMessage(final Product product)
    {
        jmsTemplate.convertAndSend(MessageConfiguration.MESSAGE_QUEUE, product);
    }
}
