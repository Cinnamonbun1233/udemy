//package Lessons.Lesson_23;
//
//public class Test2 {
//    public static void main(String[] args) {
//        Employee1 employee1 = new Employee1();
//        Teacher1 teacher1 = new Teacher1();
//        employee1.eat();
//        teacher1.eat();
//
//        Employee1 employee1 = new Teacher1();
//        employee1.eat();
//    }
//}
//
//class Employee1 {
//    String name;
//    int age;
//    int experience;
//    double salary = 100;
//
//    public Eat eat() {
//        System.out.println("Кушает работник");
//        return new Eat();
//    }
//
//    void sleep() {
//        System.out.println("Спать");
//    }
//}
//
//class Teacher1 extends Employee1 {
//    int studentCount;
//
//    public Fruit eat() {
//        System.out.println("Кушает учитель");
//        return new Fruit();
//    }
//
//    void teach() {
//        System.out.println("Учить");
//    }
//}
//
//class Eat {
//}
//
//class Fruit extends Eat {
//}
//
//class A {
//    Employee1 objectCreation() {
//        return new Employee1();
//    }
//}
//
//class b {
//    Teacher1 objectCreation() {
//        System.out.println("Ok");
//        return new H();
//    }
//}
//
//class H extends Teacher1 {
//}