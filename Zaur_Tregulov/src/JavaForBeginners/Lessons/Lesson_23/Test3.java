package JavaForBeginners.Lessons.Lesson_23;

public class Test3 {
    void abc(Animal animal) {
        System.out.println("A");
    }

    void abc(Mouse mouse) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Animal animal = new Mouse();
        test3.abc(animal);
        animal.getName();
    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}
