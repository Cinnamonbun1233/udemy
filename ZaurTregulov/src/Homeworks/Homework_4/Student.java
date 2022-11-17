package Homeworks.Homework_4;

public class Student {

    int studentIdNumber;
    String name;
    String surname;
    int year;
    double averageMath;
    double averageEcon;
    double averageLang;
}

class StudentPerson {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentIdNumber = 1567;
        student1.name = "Иван";
        student1.surname = "Иванов";
        student1.year = 2022;
        student1.averageMath = 9.2;
        student1.averageEcon = 8.9;
        student1.averageLang = 9.5;

        student2.studentIdNumber = 1568;
        student2.name = "Петр";
        student2.surname = "Петров";
        student2.year = 2022;
        student2.averageMath = 9.1;
        student2.averageEcon = 8.8;
        student2.averageLang = 9.4;

        student3.studentIdNumber = 1569;
        student3.name = "Мария";
        student3.surname = "Марьевна";
        student3.year = 2022;
        student3.averageMath = 9.0;
        student3.averageEcon = 8.7;
        student3.averageLang = 9.3;

        System.out.println("Средняя оценка студента: " + student1.surname + " " + student1.name + " - " + (student1.averageMath + student1.averageEcon + student1.averageLang)/3);
        System.out.println("Средняя оценка студента: " + student2.surname + " " + student2.name + " - " + (student2.averageMath + student2.averageEcon + student2.averageLang)/3);
        System.out.println("Средняя оценка студента: " + student3.surname + " " + student3.name + " - " + (student3.averageMath + student3.averageEcon + student3.averageLang)/3);
    }
}
