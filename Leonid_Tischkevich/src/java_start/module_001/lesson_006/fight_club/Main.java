package java_start.module_001.lesson_006.fight_club;

public class Main {
    public static void main(String[] args) {
        Cat loriCat = new Cat();
        loriCat.setName("Lori");
        loriCat.setWeight(6);

        Cat baxterCat = new Cat();
        baxterCat.setName("Baxter");
        baxterCat.setWeight(10);

        FightClub fightClub = new FightClub();
        System.out.println("Winner: " + fightClub.fight(loriCat, baxterCat));

        loriCat.setWeight(12);
        System.out.println("Winner: " + fightClub.fight(loriCat, baxterCat));
    }
}