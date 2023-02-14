package Homeworks.Homework_22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return new StringBuilder(name);
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("Name: " + getName() + ", course: " + getCourse() + ", grade:" + getGrade());
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Ivan"));
        student.setCourse(5);
        student.setGrade(9);
        student.showInfo();
        System.out.println(student.getName());
    }
}