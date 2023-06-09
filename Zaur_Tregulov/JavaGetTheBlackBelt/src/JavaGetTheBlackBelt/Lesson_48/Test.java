package JavaGetTheBlackBelt.Lesson_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        int result = Arrays.
                stream(array).
                filter(x -> x % 2 == 1).
                map(x -> {
                    if (x % 3 == 0) {
                        x = x / 3;
                    }
                    return x;
                }).
                reduce(Integer::sum).
                getAsInt();
        System.out.println(result);

        Student st1 = new Student("Иван", 'м', 23, 3, 8.3);
        Student st2 = new Student("Николай", 'м', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'ж', 19, 1, 8.9);
        Student st4 = new Student("Пётр", 'м', 35, 4, 7.0);
        Student st5 = new Student("Мария", 'ж', 23, 3, 7.4);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().
                map(x -> {
                    x.setName(x.getName().toUpperCase());
                    return x;
                }).filter(x -> x.getSex() == 'ж').
                sorted((x, y) -> x.getAge() - y.getAge()).
                forEach(System.out::println);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}