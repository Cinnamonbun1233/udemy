package lesson_009.inheritance;

import java.util.Objects;

public class British extends Cat {
    private String name;

    public British(int age, String owner, String name) {
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
        British british = (British) o;
        return name.equals(british.name) && getAge() == british.getAge() && getOwner().equals(british.getOwner());
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