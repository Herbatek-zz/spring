package com.piotrek;

import com.piotrek.character.DragonSlayer;
import com.piotrek.character.Warrior;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Warrior dragonSlayer = context.getBean("dragonSlayer", DragonSlayer.class);

        System.out.println(dragonSlayer.fight());
        System.out.println(dragonSlayer.run());

        Runtime.getRuntime().addShutdownHook(new Thread(context::close));
    }
}
