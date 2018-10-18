package com.piotrek.character;

import com.piotrek.armor.Armor;
import com.piotrek.weapon.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DragonSlayer implements Warrior {

    private Armor armor;
    private Weapon weapon;

    @Value("${piotrek.name}")
    private String name;

    public DragonSlayer(@Qualifier("dragonArmor") Armor armor) {
        this.armor = armor;
    }

    @Autowired
    public void setWeapon(@Qualifier("bow") Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String fight() {
        return name + ": " + weapon.use();
    }

    @Override
    public String run() {
        return name + ": " + armor.whenRun();
    }

    @PostConstruct
    void afterCreate() {
        System.out.println("I am ready to fight");
    }

    @PreDestroy
    void beforeDestroy() {
        System.out.println("I am dying...");
    }
}
