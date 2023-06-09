package lesson_010.interfaces;

public class Dog extends AbstractAnimal {
    @Override
    public void say() {
        System.out.println("Woof!");
    }
}