package JavaForBeginners.Lessons.Lesson_18;

public class Test_7 {

    public static void main(String[] args) {

        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(array, 2, 3); //добавить массив к StringBuilder в конце
        System.out.println(sb);

        sb.insert(2, array, 1, 3); //добавить массив к StringBuilder в указанном месте
        System.out.println(sb);
    }
}