package com.amq.simple.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.amq.simple")
@Import({ MessageConfiguration.class })
public class AppConfig {

}
