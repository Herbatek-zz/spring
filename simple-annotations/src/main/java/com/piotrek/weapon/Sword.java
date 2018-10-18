package com.piotrek.weapon;

import org.springframework.stereotype.Component;

@Component
public class Sword implements Weapon {

    @Override
    public String use() {
        return "I will cut your head with my sword";
    }
}
