package com.piotrek.character;

import com.piotrek.armor.Armor;
import com.piotrek.weapon.RangeWeapon;
import com.piotrek.weapon.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Archer extends Warrior {

    public Archer(Armor armor) {
        super(armor);
    }

    @Value("${archer.name}")
    public void setName(String name) {
        super.setName(name);
    }

    @Autowired
    public void setWeapon(@RangeWeapon Weapon weapon) {
        super.setWeapon(weapon);
    }

    public String fight() {
        return super.fight();
    }

    public String run() {
        return super.run();
    }
}
