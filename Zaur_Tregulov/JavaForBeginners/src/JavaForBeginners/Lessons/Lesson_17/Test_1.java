package JavaForBeginners.Lessons.Lesson_17;

public class Test_1 {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder(); //создан пустой объект
        StringBuilder sb2 = new StringBuilder("Good day"); //создан не пустой объект типа String
        StringBuilder sb3 = new StringBuilder(50); //создан не пустой объект типа int
        StringBuilder sb4 = new StringBuilder(sb2); //создан не пустой объект типа StringBuilder

        System.out.println(sb2.length()); //длина StringBuilder
        System.out.println(sb2.capacity()); //вместимость StringBuilder

        System.out.println(sb2.charAt(2)); //возвращает char по индексу в строке

        System.out.println(sb2.indexOf("G")); //возвращает индекс в строке по char

        System.out.println(sb2.substring(3)); //возвращает часть StringBuilder по индексу
        System.out.println(sb2.substring(3, 7)); //возвращает часть StringBuilder по индексу

        System.out.println(sb2.subSequence(2, 7)); //возвращает последовательность символов

        System.out.println(sb2.append(", friend!")); //добавляет новый кусок строки в конец StringBuilder

        System.out.println(sb2.insert(0, "Hey, ")); //добавляет новый кусок строки в выбранное место в StringBuilder

        System.out.println(sb2.delete(0, 5)); //удаляет часть StringBuilder

        System.out.println(sb2.deleteCharAt(sb2.length() - 1)); //удаляет char по указанному индексу

        System.out.println(sb2.reverse()); //переворачивает строку задом наперед
        System.out.println(sb2.reverse());

        System.out.println(sb2.replace(0, 4, "Bad")); //заменяет часть StringBuilder
    }
}