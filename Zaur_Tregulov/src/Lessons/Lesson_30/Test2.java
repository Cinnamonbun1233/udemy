package Lessons.Lesson_30;

import java.util.ArrayList;

public class Test2 {
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
//    void testStudents(ArrayList<Student> studentArrayList, StudentChecks studentChecks) {
//        for (Student student : studentArrayList) {
//            if (studentChecks.testStudent(student)) {
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
//
//        arrayList.add(student1);
//        arrayList.add(student2);
//        arrayList.add(student3);
//        arrayList.add(student4);
//        arrayList.add(student5);
//
//        StudentInfo studentInfo = new StudentInfo();
//        FindStudentsOverGrade findStudentsOverGrade = new FindStudentsOverGrade();
//        FindStudentsUnderGrade findStudentsUnderGrade = new FindStudentsUnderGrade();
//        FindStudentsOverAge findStudentsOverAge = new FindStudentsOverAge();
//        FindStudentsUnderAge findStudentsUnderAge = new FindStudentsUnderAge();
//        FindStudentsBySex findStudentsBySex = new FindStudentsBySex();
//        FindStudentsMixConditions findStudentsMixConditions = new FindStudentsMixConditions();
//
//        studentInfo.testStudents(arrayList,findStudentsOverGrade);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList,findStudentsUnderGrade);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList,findStudentsOverAge);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList,findStudentsUnderAge);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList,findStudentsBySex);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList,findStudentsMixConditions);
//
//    }
//}
//
//interface StudentChecks {
//    boolean testStudent(Student student);
//}
//
//class FindStudentsOverGrade implements StudentChecks {
//
//    @Override
//    public boolean testStudent(Student student) {
//        return student.averageGrade > 8.5;
//    }
//}
//
//class FindStudentsUnderGrade implements StudentChecks {
//
//    @Override
//    public boolean testStudent(Student student) {
//        return student.averageGrade < 9;
//    }
//}
//
//class FindStudentsOverAge implements StudentChecks {
//
//    @Override
//    public boolean testStudent(Student student) {
//        return student.age > 25;
//    }
//}
//
//class FindStudentsUnderAge implements StudentChecks {
//
//    @Override
//    public boolean testStudent(Student student) {
//        return student.age < 27;
//    }
//}
//
//class FindStudentsBySex implements StudentChecks {
//
//    @Override
//    public boolean testStudent(Student student) {
//        return student.sex == 'м';
//    }
//}
//
//class FindStudentsMixConditions implements StudentChecks {
//
//    @Override
//    public boolean testStudent(Student student) {
//        return (student.averageGrade > 7.2 && student.age < 23 && student.sex == 'ж');
//    }
//}