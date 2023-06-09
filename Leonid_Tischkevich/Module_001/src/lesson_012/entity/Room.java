package lesson_012.entity;

public class Room {
    private final int numberOfPerson;
    private final int cost;
    private boolean free;

    public Room(int numberOfPerson, int cost, boolean free) {
        this.numberOfPerson = numberOfPerson;
        this.cost = cost;
        this.free = free;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }


    public int getCost() {
        return cost;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}