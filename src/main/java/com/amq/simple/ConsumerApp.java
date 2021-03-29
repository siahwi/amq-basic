package com.amq.simple;

import com.amq.simple.config.AppConfig;
import com.amq.simple.model.Product;
import com.amq.simple.receiver.MessageReceiver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ConsumerApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        MessageReceiver messageReceiver = (MessageReceiver) context.getBean("messageReceiver");
        Product product = messageReceiver.receiveMessage();
        System.out.println("Message received : " + product);

        ((AbstractApplicationContext) context).close();
    }
}
