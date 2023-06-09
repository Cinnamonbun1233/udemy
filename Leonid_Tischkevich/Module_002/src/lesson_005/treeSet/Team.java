package lesson_005.treeSet;

public class Team implements Comparable<Team> {
    private String name;
    private int strength;
    private int score;

    public Team(String name, int strength, int score) {
        this.name = name;
        this.strength = strength;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Team o) {
        if (this.score < o.score) {
            return 1;
        } else if (this.score > o.score) {
            return -1;
        } else {
            return 0;
        }
    }
}