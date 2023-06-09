package lesson_009.inheritance;

public class Main {
    public static void main(String[] args) {
        British lori = new British(4, "Alex", "Lori");
        Scottish baxter = new Scottish(10, "Andre", "Baxter");

        lori.sayMeow();
        baxter.sayMeow();

        System.out.println("Cat name: " + lori.getName() + ", age: " + lori.getAge() + ", owner: " +
                lori.getOwner());
        System.out.println("Cat name: " + baxter.getName() + ", age: " + baxter.getAge() + ", owner: " +
                baxter.getOwner());

        System.out.println(lori);
        System.out.println(baxter);

        British martin_1 = new British(4, "Alex", "Martin");
        British martin_2 = new British(4, "Alex", "Martin");

        System.out.println(martin_1.equals(martin_2));
    }
}