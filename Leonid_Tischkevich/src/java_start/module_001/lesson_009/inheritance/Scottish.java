package java_start.module_001.lesson_009.inheritance;

import java.util.Objects;

public class Scottish extends Cat {
    private String name;

    public Scottish(int age, String owner, String name) {
        super(age, owner);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scottish scottish = (Scottish) o;
        return Objects.equals(getName(), scottish.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Cat name: " + getName() + ", age: " + getAge() + ", owner: " + getOwner();
    }
}