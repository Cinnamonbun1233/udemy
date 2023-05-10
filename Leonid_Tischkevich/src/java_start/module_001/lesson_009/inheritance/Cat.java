package java_start.module_001.lesson_009.inheritance;

public class Cat {
    private int age;
    private String owner;

    public Cat(int age, String owner) {
        setAge(age);
        setOwner(owner);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void sayMeow() {
        System.out.println("Meow");
    }
}