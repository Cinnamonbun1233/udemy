package JavaForBeginners.Homeworks.Homework_12;

public class Student {

    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void compareStudents1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    public static void compareStudents2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            System.out.print("У студентов одинаковое имя");
        } else {
            System.out.print("У студентов разное имя");
        }

        if (st1.course == st2.course) {
            System.out.print(", одинаковый курс");
        } else {
            System.out.print(", разный курс");
        }

        if (st1.grade == st2.grade) {
            System.out.println(" и одинаковый балл");
        } else {
            System.out.println(", и разный балл");
        }
    }
}

class StudentTest {

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 1, 8.5);
        Student st2 = new Student("Ivan", 1, 9.0);
        Student.compareStudents1(st1, st2);
        Student.compareStudents2(st1, st2);
    }
}