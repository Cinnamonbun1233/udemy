package lesson_013.immutables;

public final class Owner {
    private final String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}