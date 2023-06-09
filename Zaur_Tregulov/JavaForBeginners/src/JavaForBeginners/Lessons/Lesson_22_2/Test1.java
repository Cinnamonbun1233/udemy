package JavaForBeginners.Lessons.Lesson_22_2;

import JavaForBeginners.Lessons.Lesson_22.Human;

public class Test1 {
    public static void main(String[] args) {
        Human h = new Human("male");
        h.setName(new StringBuilder("Petya"));
        h.setAge(25);
        h.setWeight(65);
        System.out.println(h.getName() + " " + h.getAge() + " " + h.getWeight());
    }
}