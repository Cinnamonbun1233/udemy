package java_start.part_001.lesson_008.constructor;

public class Constructor {
    public static void main(String[] args) {
        SayCatService sayCatService = new SayCatService();

        Cat lori = new Cat("Lori");
        sayCatService.say(lori, "Я хочу есть!");

        Cat baxter = new Cat("Baxter");
        sayCatService.say(baxter, "Я хочу спать!");

        Cat martin = new Cat("Martin");
        sayCatService.say(martin, "Я хочу играть!");

        SayCatService.sayMeow();
        System.out.println(SayCatService.hello);
    }
}
