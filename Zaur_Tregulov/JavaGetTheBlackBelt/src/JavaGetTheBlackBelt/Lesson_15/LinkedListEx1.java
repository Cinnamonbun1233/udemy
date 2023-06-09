package JavaGetTheBlackBelt.Lesson_15;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 3);
        Student st2 = new Student("Николай", 2);
        Student st3 = new Student("Елена", 1);
        Student st4 = new Student("Пётр", 4);
        Student st5 = new Student("Мария", 3);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("LinkedList = " + studentLinkedList);
        System.out.println(studentLinkedList.get(2));

        Student st6 = new Student("Заур", 3);
        Student st7 = new Student("Игорь", 4);
        studentLinkedList.add(st6);
        System.out.println("LinkedList = " + studentLinkedList);
        studentLinkedList.add(1, st7);
        System.out.println("LinkedList = " + studentLinkedList);
        studentLinkedList.remove(3);
        System.out.println("LinkedList = " + studentLinkedList);
    }
}

class Student {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}