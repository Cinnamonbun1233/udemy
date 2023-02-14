package Lessons.Lesson_22;

public class Human {
    public Human(String sex) {
        this.sex = sex;
    }

    final String sex;
    private StringBuilder name;
    private int age;
    private int weight;
    private boolean clever;

    public String getSex() {
        return sex;
    }

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public boolean isClever() {
        return clever;
    }
}

class Test {
    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName(new StringBuilder("Petya"));
        h.setAge(25);
        h.setWeight(65);
        h.getName().append("!!!");
        System.out.println(h.getName() + " " + h.getAge() + " " + h.getWeight());
    }
}