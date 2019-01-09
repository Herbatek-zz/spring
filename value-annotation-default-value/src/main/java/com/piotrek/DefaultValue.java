package com.piotrek;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class DefaultValue {

    @Value("${name.name1:some default value1}")
    private String name1;

    @Value("${name.name2}")
    private String name2;

    void sayFirst() {
        System.out.println("Name1: " + name1);
    }

    void saySecond() {
        System.out.println("Name2: " + name2);
    }
}
