package Homeworks.Homework6;

public class Student {

    int studentIdNumber;
    String name;
    String surname;
    int year;
    double averageMath;
    double averageEcon;
    double averageLang;

    Student(int studentIdNumber, String name, String surname, int year, double averageMath, double averageEcon, double averageLang) {
        this.studentIdNumber = studentIdNumber;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.averageMath = averageMath;
        this.averageEcon = averageEcon;
        this.averageLang = averageLang;
    }

    Student(int studentIdNumber, String name, String surname) {
        this(studentIdNumber, name, surname, 0, 0.0, 0.0, 0.0);
    }

    Student() {
    }
}

class StudentTest {

    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student(123, "Иван", "Иванов");
        Student st3 = new Student(234, "Петр", "Петров", 2020, 9.0, 8.8, 9.2);

        System.out.println(st1.name);
        System.out.println(st2.name);
        System.out.println(st3.name);
    }
}