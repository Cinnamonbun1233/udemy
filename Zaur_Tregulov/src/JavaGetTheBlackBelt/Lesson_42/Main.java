package JavaGetTheBlackBelt.Lesson_42;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 'м', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'м', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'ж', 19, 1, 8.9);
        Student st4 = new Student("Пётр", 'м', 35, 4, 7.0);
        Student st5 = new Student("Мария", 'ж', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Function<Student, Double> f = student -> student.avgGrade;
        double result = avgOfSomething(students, f);
        System.out.println(result);
        double result1 = avgOfSomething(students, student -> (double) student.course);
        System.out.println(result1);
        double result2 = avgOfSomething(students, student -> (double) student.age);
        System.out.println(result2);
    }

    private static double avgOfSomething(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student student : list) {
            result += f.apply(student);
        }
        result = result / list.size();
        return result;
    }
}