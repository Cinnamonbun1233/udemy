package JavaForBeginners.Lessons.Lesson_23;

public class Test5 {
}

class Animal2 {
//    String showName() {
//        return "someAnimal";
//    }

    static String showName() {
        return "someAnimal";
    }

//    void showInfo() {
//        System.out.println("Name of animal: " + showName());
//    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse2 extends Animal2 {
    static String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }
    public static void main(String[] args) {
        Mouse2 animal2 = new Mouse2();
        animal2.showInfoAboutAnimal();
        animal2.showInfoAboutMouse();
    }
}