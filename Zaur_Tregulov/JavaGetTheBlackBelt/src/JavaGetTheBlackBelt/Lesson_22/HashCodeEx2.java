package JavaGetTheBlackBelt.Lesson_22;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx2 {
    public static void main(String[] args) {
        Map<Integer, Student> map1 = new HashMap<>(16, 0.75f);

        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Заур", "Трегулов", 3);
        Student st2 = new Student("Мария", "Иванова", 1);
        Student st3 = new Student("Сергей", "Петров", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        System.out.println(map);
        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());
//        st1.course = 4;
        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());
    }
}

final class Student {
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
