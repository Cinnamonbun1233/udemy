package java_start.part_001.lesson_013.immutables;

public final class Owner {
    private final String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}