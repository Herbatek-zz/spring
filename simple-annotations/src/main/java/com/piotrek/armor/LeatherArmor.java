package com.piotrek.armor;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class LeatherArmor implements Armor {

    @Override
    public String whenRun() {
        return "I can easy run with this light armor";
    }
}
