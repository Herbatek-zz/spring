package com.piotrek.character;

import com.piotrek.armor.Armor;
import com.piotrek.weapon.Weapon;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public abstract class Warrior {

    private String name;
    private Armor armor;
    private Weapon weapon;

    Warrior(Armor armor) {
        this.armor = armor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String fight() {
        return this.name + ": " + weapon.use();
    }

    public String run() {
        return this.name + ": " + armor.whenRun();
    }

    @PostConstruct
    void afterCreate() {
        System.out.println(this.getClass().getSimpleName() + ": I am ready to fight");
    }

    @PreDestroy
    void beforeDestroy() {
        System.out.println(this.getClass().getSimpleName() + ": I am dying...");
    }
}
