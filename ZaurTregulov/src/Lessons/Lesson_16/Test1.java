package Lessons.Lesson_16;

public class Test1 {


    public static void main(String[] args) {

        String s1 = "privet";
        String s2 = "abcdefgabcd";
        String s3 = "   HI!   ";

        int a = s1.length(); //длина String
        System.out.println(a);

        char c1 = s1.charAt(3); //возвращает char, соответсвующий поряковому номеру в String
        System.out.println(c1);

        int i1 = s1.indexOf('t'); //возвращает номер char или части String в String
        System.out.println(i1);

        int i2 = s1.indexOf("vet"); //возвращает номер char или части String в String
        System.out.println(i2);

        int i3 = s1.indexOf("Z"); //возвращает номер char или части String в String
        System.out.println(i3);

        int i4 = s2.indexOf("a", 2); //возвращает номер char или части String в String начиная с указанного номера
        System.out.println(i4);

        boolean b1 = s1.startsWith("pri"); //начинается ли String с указанного в параметре String
        System.out.println(b1);

        boolean b2 = s1.startsWith("ve", 3); //начинается ли String с указанного в параметре String
        System.out.println(b2);

        boolean b3 = s1.endsWith("vet"); //заканчивается ли String с указанного в параметре String
        System.out.println(b3);

        String st1 = s1.substring(3, 5); //возващает кусочек String по порядковому номеру
        System.out.println(st1);

        String st2 = s1.substring(3); //возващает кусочек String по порядковому номеру
        System.out.println(st2);

        String st3 = s3.trim(); //убирает пробелы в начале и конце String
        System.out.println(st3);

        String st4 = s1.replace('p', 'f'); //заменяет char
        System.out.println(st4);

        String st5 = s1.replace("privet", "good buy"); //заменяет String
        System.out.println(st5);

        String st6 = s1.concat(s2); //склеивает 2 String
        System.out.println(st6);

        String st7 = s3.toLowerCase(); //переводит String в нижний регистр
        System.out.println(st7);

        String st8 = s1.toUpperCase(); //переводит String в верхний регистр
        System.out.println(st8);

        boolean b4 = s1.contains("pri"); //содержит ли String часть String
        System.out.println(b4);

    }
}

class Employee {

    double salary;
    boolean isManager;


    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp = new Employee(100.5, true);
        System.out.println("Он менеджер? " + emp.isManager + '\n' + "Его зп: " + emp.salary);
    }
}