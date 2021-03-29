package com.amq.simple;

import com.amq.simple.config.AppConfig;
import com.amq.simple.model.Product;
import com.amq.simple.producer.MessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ProducerApp {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        MessageSender messageSender = context.getBean(MessageSender.class);

        Product product = new Product();
        product.setProductId(888);
        product.setName("TV");
        product.setQuantity(1);

        messageSender.sendMessage(product);
        System.out.println("Message has been sent successfully.");

        ((AbstractApplicationContext) context).close();
    }
}
