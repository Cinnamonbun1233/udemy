package com.example.springcontext;

import com.example.springcontext.repository.FightClub;
import com.example.springcontext.repository.FightClubImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        FightClub fightClub = context.getBean(FightClub.class);
        fightClub.fight();
    }
}