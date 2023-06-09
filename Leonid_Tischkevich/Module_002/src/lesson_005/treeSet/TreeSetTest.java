package lesson_005.treeSet;

import java.util.Comparator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Team> teams = new TreeSet<>(new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                if (o1.getScore() < o2.getScore()) {
                    return -1;
                } else if (o1.getScore() > o2.getScore()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            teams.add(new Team("Team" + i, i, random.nextInt(10)));
        }

        for (Team team : teams) {
            System.out.println(team);
        }
    }
}