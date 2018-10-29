package com.piotrek.weapon;

import org.springframework.stereotype.Component;

@RangeWeapon
@Component
public class Bow implements Weapon {

    @Override
    public String use() {
        return "One shot, one kill";
    }
}
