package JavaGetTheBlackBelt.Lesson_27;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        Student st1 = new Student("Заур", 3);
        Student st2 = new Student("Мария", 1);
        Student st3 = new Student("Сергей", 4);
        Student st4 = new Student("Игорь", 2);
        Student st5 = new Student("Василий", 1);
        Student st6 = new Student("Олег", 3);
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(st6));
        System.out.println(set.tailSet(st6));
        System.out.println(set.subSet(st4, st3));
        System.out.println(st2.equals(st5));
        System.out.println(st2.hashCode());
        System.out.println(st5.hashCode());

    }
}

class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student student) {
        return this.course - student.course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}