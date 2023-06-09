package JavaForBeginners.Lessons.Lesson_30;

public class Test3 {
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
//        Student student1 = new Student("Иван", 'м', 22, 3, 8.3);
//        Student student2 = new Student("Николай", 'м', 28, 2, 6.4);
//        Student student3 = new Student("Елена", 'ж', 19, 1, 8.9);
//        Student student4 = new Student("Петр", 'м', 35, 4, 7.0);
//        Student student5 = new Student("Мария", 'ж', 23, 3, 9.1);
//
//        ArrayList<Student> arrayList = new ArrayList<>();
//        arrayList.add(student1);
//        arrayList.add(student2);
//        arrayList.add(student3);
//        arrayList.add(student4);
//        arrayList.add(student5);
//
//        StudentInfo studentInfo = new StudentInfo();
//
//        studentInfo.testStudents(arrayList, (Student student) -> student.averageGrade > 8.5);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList, student -> student.averageGrade < 9);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList, (Student student) -> student.age > 25);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList, (Student student) -> student.age < 27);
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList, (Student student) -> student.sex == 'м');
//        System.out.println("----------");
//        studentInfo.testStudents(arrayList, (Student student) -> student.averageGrade > 7.2 && student.age < 23 && student.sex == 'ж');
//        System.out.println("----------");
//    }
//}
//
//interface StudentChecks {
//    boolean testStudent(Student student);
//}