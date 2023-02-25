package JavaGetTheBlackBelt.Lesson_23;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Заур", "Трегулов", 3);
        Student st2 = new Student("Мария", "Иванова", 1);
        Student st3 = new Student("Сергей", "Петров", 4);
        Student st4 = new Student("Игорь", "Сидоров", 2);
        Student st5 = new Student("Василий", "Смирнов", 1);
        Student st6 = new Student("Саша", "Капустин", 3);
        Student st7 = new Student("Елена", "Сидорова", 4);
        Student st8 = new Student("Елена", "Сидорова", 4);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(9.4, st5);
        treeMap.put(4.7, st6);
        treeMap.put(5.5, st7);
        treeMap.put(3.2, st8);



//        System.out.println(treeMap);
//        System.out.println(treeMap.get(7.5));
//        System.out.println(treeMap.remove(9.4));
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.headMap(8.0));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());

        TreeMap<Student, Double> treeMap1 = new TreeMap<>();
        treeMap1.put(st1, 5.8);
        treeMap1.put(st2, 6.4);
        treeMap1.put(st3, 7.2);
        treeMap1.put(st4, 7.5);
        treeMap1.put(st5, 9.4);
        treeMap1.put(st6, 4.7);
        treeMap1.put(st7, 5.5);
        treeMap1.put(st8, 5.8);

//        System.out.println(treeMap1);
//        System.out.println(treeMap1.containsKey(st8));
    }
}

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}