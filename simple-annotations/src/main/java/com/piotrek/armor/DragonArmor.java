package com.piotrek.armor;

import org.springframework.stereotype.Component;

@Component
public class DragonArmor implements Armor {

    @Override
    public String whenRun() {
        return "I can not run fast with this armor...";
    }
}
