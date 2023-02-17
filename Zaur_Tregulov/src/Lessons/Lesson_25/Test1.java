package Lessons.Lesson_25;

import com.sun.source.doctree.DocRootTree;

public class Test1 {
    public static void main(String[] args) {
        Employee employee1 = new Teacher();
        Employee employee2 = new Driver();
        Employee employee3 = new Doctor();
        HelpAble helpAble = new Teacher();
        Employee[] array1 = {employee1, employee2, employee3};

        employee1.work();
        employee2.work();
        employee3.work();
        helpAble.help();
        System.out.println();

        for (Employee emp : array1){
            emp.work();
        }
        System.out.println();

        System.out.println(employee1 instanceof Employee);
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements HelpAble {
    void work() {
        System.out.println("Teacher works");
    }

    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements HelpAble {
    void work() {
        System.out.println("Driver works");
    }

    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements HelpAble {
    void work() {
        System.out.println("Doctor works");
    }

    public void help() {
        System.out.println("Doctor helps");
    }
}

interface HelpAble {
    void help();
}