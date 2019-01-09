package com.piotrek;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Example {

    private MessageSource messageSource;

    public Example(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    void sayHelloPL() {
        System.out.println("PL: " + messageSource.getMessage("hello", null, Locale.forLanguageTag("pl")));
    }

    void sayHelloEN() {
        System.out.println("ENG: " + messageSource.getMessage("hello", null, Locale.ENGLISH));
    }
}
