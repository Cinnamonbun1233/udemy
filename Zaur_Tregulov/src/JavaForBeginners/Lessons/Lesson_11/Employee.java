package JavaForBeginners.Lessons.Lesson_11;

public class Employee {

    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double increase1(double a) {
        return a * 2;
    }

    public double increase2() {
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Ivan", 100.55);
        System.out.println(emp1.increase1(emp1.salary));
        System.out.println(emp1.salary);
        System.out.println(emp1.increase2());
        System.out.println(emp1.salary);
    }
}