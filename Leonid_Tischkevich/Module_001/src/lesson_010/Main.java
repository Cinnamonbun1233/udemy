package lesson_010;

import lesson_010.entity.AbstractAnimal;
import lesson_010.entity.Cat;
import lesson_010.entity.Dog;

public class Main {
    public static void main(String[] args) {
        Cat lori = new Cat();
        Dog bublik = new Dog();

        lori.say();
        bublik.say();

        findOwner(lori);
        findOwner(bublik);

        System.out.println("Lori: " + lori.getOwner());
        System.out.println("Bublik: " + bublik.getOwner());
    }

    private static void findOwner(AbstractAnimal animal) {
        if (animal.getClass() == Cat.class) {
            animal.setOwner("Cat_Owner");
        }
        if (animal.getClass() == Dog.class) {
            animal.setOwner("Dog_Owner");
        }
    }
}