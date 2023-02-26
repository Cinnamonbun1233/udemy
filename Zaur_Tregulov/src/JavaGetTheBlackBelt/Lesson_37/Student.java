package JavaGetTheBlackBelt.Lesson_37;

import java.util.ArrayList;

interface StudentChecks {
    boolean check(Student student);
}

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

        studentInfo.testStudents(students, new CheckOverGrade());
        studentInfo.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student student) {
                return student.age < 30;
            }
        });
        studentInfo.testStudents(students, student -> student.age < 30);
        studentInfo.testStudents(students, student -> student.avgGrade > 8);
        studentInfo.testStudents(students, student -> student.age > 20 && student.avgGrade < 9.3 && student.sex == 'ж');

       /* studentInfo.printStudentsOverGrade(students, 8);
        System.out.println("----------");
        studentInfo.printStudentsUnderAge(students, 30);
        System.out.println("----------");
        studentInfo.printStudentMixCondition(students, 20, 9.5, 'ж');*/
    }

    void testStudents(ArrayList<Student> arrayList, StudentChecks studentChecks) {
        for (Student student : arrayList) {
            if (studentChecks.check(student)) {
                System.out.println(student);
            }
        }
        System.out.println("----------");
    }

   /* void printStudentsOverGrade(ArrayList<Student> arrayList, double grade) {
        for (Student student : arrayList) {
            if (student.avgGrade > grade) {
                System.out.println(student);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> arrayList, int age) {
        for (Student student : arrayList) {
            if (student.age < age) {
                System.out.println(student);
            }
        }
    }

    void printStudentMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex) {
        for (Student student : arrayList) {
            if (student.age > age && student.avgGrade < grade && student.sex == sex) {
                System.out.println(student);
            }
        }
    }*/
}

class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student student) {
        return student.avgGrade > 8;
    }
}