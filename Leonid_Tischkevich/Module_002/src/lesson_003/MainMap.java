package lesson_003;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Cat> catMap = new HashMap<>();

        Cat lori = new Cat("Lori", 4);
        Cat baxter = new Cat("Baxter", 7);
        Cat martin = new Cat("Martin", 3);
        Cat bublik = new Cat("Bublik", 4);

        String loriKey = "lori";
        String baxterKey = "baxter";
        String bublikKey = "bublik";
        String martinKey = "martin";

        catMap.put(loriKey, lori);
        catMap.put(baxterKey, baxter);
        catMap.put(martinKey, martin);
        catMap.put(bublikKey, bublik);

        System.out.println(catMap.get(loriKey));
        System.out.println(catMap.get(baxterKey));
        System.out.println(catMap.get(bublikKey));
        System.out.println(catMap.get(martinKey));

        WeekDays friday = WeekDays.FRIDAY;
        if (friday == WeekDays.FRIDAY) {
            System.out.println("Friday");
        }

        System.out.println(friday.getDayNumberOfWeek());

        WeekDays monday = WeekDays.valueOf("MONDAY");
        System.out.println("Enum value of " + monday + " number " + monday.getDayNumberOfWeek());
    }
}