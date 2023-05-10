package java_start.module_001.lesson_006.fight_club;

public class FightClub {
    public String fight(Cat firstCat, Cat secondCat) {
        if (firstCat.getWeight() > secondCat.getWeight()) {
            return firstCat.getName();
        } else {
            return secondCat.getName();
        }
    }
}