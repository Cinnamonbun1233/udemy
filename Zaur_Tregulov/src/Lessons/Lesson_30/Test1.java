package Lessons.Lesson_30;

import java.util.ArrayList;

public class Test1 {

}

//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double averageGrade;
//
//    public Student(String name, char sex, int age, int course, double averageGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.averageGrade = averageGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudent(Student student) {
//        System.out.println("Имя студента: " + student.name + ", пол: " + student.sex + ", возраст: " + student.age +
//                ", курс: " + student.course + ", средняя оценка: " + student.averageGrade);
//    }
//
//    void printStudentOverGrade(ArrayList<Student> studentArrayList, double averageGrade) {
//        for (Student student : studentArrayList) {
//            if (student.averageGrade > averageGrade) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentUnderGrade(ArrayList<Student> studentArrayList, double averageGrade) {
//        for (Student student : studentArrayList) {
//            if (student.averageGrade < averageGrade) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentOverAge(ArrayList<Student> studentArrayList, int age) {
//        for (Student student : studentArrayList) {
//            if (student.age > age) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> studentArrayList, int age) {
//        for (Student student : studentArrayList) {
//            if (student.age < age) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentBySex(ArrayList<Student> studentArrayList, char sex) {
//        for (Student student : studentArrayList) {
//            if (student.sex == sex) {
//                printStudent(student);
//            }
//        }
//    }
//
//    void printStudentsMixConditions(ArrayList<Student> studentArrayList, double averageGrade, int age, char sex) {
//        for (Student student : studentArrayList) {
//            if (student.averageGrade > averageGrade && student.age < age && student.sex == sex) {
//                printStudent(student);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> arrayList = new ArrayList<>();
//        Student student1 = new Student("Иван", 'м', 22, 3, 8.3);
//        Student student2 = new Student("Николай", 'м', 28, 2, 6.4);
//        Student student3 = new Student("Елена", 'ж', 19, 1, 8.9);
//        Student student4 = new Student("Петр", 'м', 35, 4, 7.0);
//        Student student5 = new Student("Мария", 'ж', 23, 3, 9.1);
//        arrayList.add(student1);
//        arrayList.add(student2);
//        arrayList.add(student3);
//        arrayList.add(student4);
//        arrayList.add(student5);
//        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.printStudentOverGrade(arrayList, 8.5);
//        System.out.println("----------");
//        studentInfo.printStudentUnderGrade(arrayList, 9);
//        System.out.println("----------");
//        studentInfo.printStudentOverAge(arrayList, 25);
//        System.out.println("----------");
//        studentInfo.printStudentUnderAge(arrayList, 27);
//        System.out.println("----------");
//        studentInfo.printStudentBySex(arrayList, 'м');
//        System.out.println("----------");
//        studentInfo.printStudentsMixConditions(arrayList, 7.2, 23, 'ж');
//    }
//}