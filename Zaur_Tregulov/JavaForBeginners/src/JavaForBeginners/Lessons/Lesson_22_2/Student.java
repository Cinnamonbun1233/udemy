package JavaForBeginners.Lessons.Lesson_22_2;

import JavaForBeginners.Lessons.Lesson_22.Person;

public class Student extends Person {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}