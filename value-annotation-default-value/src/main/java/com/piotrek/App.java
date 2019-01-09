package com.piotrek;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.piotrek")
@PropertySource("classpath:application.properties")
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        DefaultValue defaultValue = context.getBean("defaultValue", DefaultValue.class);
        defaultValue.sayFirst();
        defaultValue.saySecond();

        context.close();
    }
}
