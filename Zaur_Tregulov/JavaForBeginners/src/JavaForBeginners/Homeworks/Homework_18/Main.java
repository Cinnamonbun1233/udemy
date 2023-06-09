package JavaForBeginners.Homeworks.Homework_18;


public class Main {

    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.print(" }");
    }

    public static void sortirovka(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
    }

    public static void main(String[] args) {

        int[] array1 = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        sortirovka(array1);
        for (int sort : array1) {
            System.out.println(sort);
        }

        String[][] array2 = {{"Privet", "Poka"}, {"Kak dela", "Good day"}};
        showArray(array2);
    }
}