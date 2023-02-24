package JavaGetTheBlackBelt.Lessons.Lesson_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
}

abstract class Participant {
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Schoolar extends Participant {

    public Schoolar(String name, int age) {
        super(name, age);
    }
}

class Student extends Participant {

    public Student(String name, int age) {
        super(name, age);
    }
}

class Employee extends Participant {
    public Employee(String name, int age) {
        super(name, age);
    }
}

class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println("В команду " + name + " был добавлен новый участник по имени " + ((Participant) participant).getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Выиграла команда " + winnerName);
    }
}

class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Иван", 13);
        Schoolar schoolar2 = new Schoolar("Мария", 15);

        Schoolar schoolar3 = new Schoolar("Сергей", 12);
        Schoolar schoolar4 = new Schoolar("Оля", 14);

        Student student1 = new Student("Николай", 20);
        Student student2 = new Student("Ксений", 18);

        Employee employee1 = new Employee("Заур", 32);
        Employee employee2 = new Employee("Михаил", 47);

        Team<Schoolar> schoolarTeam = new Team<>("Драконы");
        Team<Schoolar> schoolarTeam2 = new Team<>("Мудрецы");
        Team<Student> studentTeam = new Team<>("Вперёд");
        Team<Employee> employeeTeamTeam = new Team<>("Работяги");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

//        schoolarTeam.addNewParticipant(student2);

        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeamTeam.addNewParticipant(employee1);
        employeeTeamTeam.addNewParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);
        schoolarTeam.playWith(schoolarTeam2);
        schoolarTeam.playWith(schoolarTeam2);

//        schoolarTeam.playWith(employeeTeamTeam);

    }
}