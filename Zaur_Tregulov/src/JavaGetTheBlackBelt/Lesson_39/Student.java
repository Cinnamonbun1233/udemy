package JavaGetTheBlackBelt.Lesson_39;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Student {
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
        StudentInfo studentInfo = new StudentInfo();

        Predicate<Student> p1 = student -> student.age > 18;
        Predicate<Student> p2 = student -> student.avgGrade > 7.5;
        Predicate<Student> p3 = student -> student.sex == 'м';

        studentInfo.testStudents(students, student -> student.age < 30);
        studentInfo.testStudents(students, student -> student.avgGrade > 8);
        studentInfo.testStudents(students, student -> student.age > 20 && student.avgGrade < 9.3 && student.sex == 'ж');
        studentInfo.testStudents(students, p1);
        studentInfo.testStudents(students, p2);
        studentInfo.testStudents(students, p3);

        studentInfo.testStudents(students, p1.and(p2));
        studentInfo.testStudents(students, p2.or(p3));

        studentInfo.testStudents(students, p1.negate());
        studentInfo.testStudents(students, p2.negate());
    }

    void testStudents(ArrayList<Student> arrayList, Predicate<Student> predicate) {
        for (Student student : arrayList) {
            if (predicate.test(student)) {
                System.out.println(student);
            }
        }
        System.out.println("----------");
    }
}