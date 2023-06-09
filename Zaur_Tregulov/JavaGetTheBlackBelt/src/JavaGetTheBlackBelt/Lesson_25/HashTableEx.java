package JavaGetTheBlackBelt.Lesson_25;


import java.util.Hashtable;
import java.util.Objects;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();
        Student st1 = new Student("Заур", "Трегулов", 3);
        Student st2 = new Student("Мария", "Иванова", 1);
        Student st3 = new Student("Сергей", "Петров", 4);
        Student st4 = new Student("Игорь", "Сидоров", 2);
        Student st5 = new Student("Василий", "Смирнов", 1);
        hashtable.put(5.8, st1);
        hashtable.put(6.4, st2);
        hashtable.put(7.2, st3);
        hashtable.put(7.5, st4);
        hashtable.put(9.4, st5);
        System.out.println(hashtable);

//        hashtable.put(null,st4);
//        System.out.println(hashtable);
    }
}

class Student {
    private final String name;
    private final String surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }
}