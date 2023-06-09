package lesson_006.service;

import lesson_006.entity.Cat;

public class FightClub {
    public String fight(Cat firstCat, Cat secondCat) {
        if (firstCat.getWeight() > secondCat.getWeight()) {
            return firstCat.getName();
        } else {
            return secondCat.getName();
        }
    }
}