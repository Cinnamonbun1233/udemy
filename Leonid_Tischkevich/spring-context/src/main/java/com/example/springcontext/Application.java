package com.example.springcontext;

import com.example.springcontext.repository.FightClubImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        FightClubImpl fightClub = context.getBean(FightClubImpl.class);
        fightClub.fight();
    }
}