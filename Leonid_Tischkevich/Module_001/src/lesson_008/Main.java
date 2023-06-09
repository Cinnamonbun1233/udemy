package lesson_008;

import lesson_008.entity.Cat;
import lesson_008.service.SayCatService;

public class Main {
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