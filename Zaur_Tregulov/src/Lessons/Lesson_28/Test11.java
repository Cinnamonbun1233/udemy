package Lessons.Lesson_28;


import java.util.ArrayList;

public class Test11 {
//    static ArrayList<String> list;

    static Doctor[] array = new Doctor[4];

    public static void main(String[] args) {

        System.out.println(array[0]);

//        list.add("!!!");

//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Teacher t3 = new Teacher();
//        Teacher[] array2 = {t, t3};
//        Employee[] array1 = {d, t};
//        Teacher t2 = (Teacher) array1[0];
//        Doctor d2 = (Doctor) array2[0];
//        createPassword("ABCDEF");

        Integer.parseInt("44op");
    }

    public static void createPassword(String pswd) {
        if (pswd.length() < 6) {
            throw new IllegalArgumentException("Длина пароля слишком маленькая");
        }
        if (pswd.length() > 12) {
            throw new IllegalArgumentException("Длина пароля слишком большая");
        }
        System.out.println("Пароль принят");
    }
}

class Employee {

}

class Doctor extends Employee {

}

class Teacher extends Employee {

}

class Plane {
    String status = "wait"; //on air, cancel

    public void fly() {
        status = "on air";
        System.out.println("Самолет летит");
    }

    public void waiting() {
        if (status.equals("on air")) {
            throw new IllegalStateException("Самолет уже в воздухе");
        }
        status = "wait";
        System.out.println("Самолет в ожидании полета");
    }

    public void flyCancel() {
        if (status.equals("on air")) {
            throw new IllegalStateException("Самолет уже в воздухе");
        }
        status = "cancel";
        System.out.println("Полет самолета отменен");
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.waiting();
        plane.fly();
        plane.flyCancel();
    }
}