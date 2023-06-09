package lesson_010.entity;

public class Dog extends AbstractAnimal {
    @Override
    public void say() {
        System.out.println("Woof!");
    }
}