package JavaGetTheBlackBelt.Lesson_20;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Заур Трегулов");
        map1.put(3568, "Иван Иванов");
        map1.put(6578, "Мария Сидорова");
        map1.put(15879, "Николай Петров");
        map1.put(98745, "Николай Петров");
        map1.putIfAbsent(1000, "Олег Иванов");
        map1.put(null, "Сергей Петров");
        map1.put(85241, null);
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(98745);
        System.out.println(map1);
        System.out.println(map1.containsValue("Иван Иванов"));
        System.out.println(map1.containsKey(3568));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String,String> map2 = new HashMap<>();
        map2.put("Саша","добрый");
        map2.put("Олег","умный");
        System.out.println(map2);
    }
}
