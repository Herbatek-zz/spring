package com.piotrek;

import com.piotrek.character.Archer;
import com.piotrek.character.DragonSlayer;
import com.piotrek.character.Warrior;
import com.piotrek.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Warrior dragonSlayer = context.getBean("dragonSlayer", DragonSlayer.class);
        System.out.println(dragonSlayer.fight());
        System.out.println(dragonSlayer.run());

        System.out.println();

        Archer archer = context.getBean("archer", Archer.class);
        System.out.println(archer.fight());
        System.out.println(archer.run());

        context.close();
    }
}
