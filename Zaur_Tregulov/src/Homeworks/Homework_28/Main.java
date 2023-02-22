package Homeworks.Homework_28;

public class Main {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("мясо");
        try {
            t.drink("вода");
            try {
                t.drink("пиво");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Это inner finally блок");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String s) {
        super(s);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}

class Tiger {

    void eat(String s) {
        if (!s.equals("мясо")) {
            throw new NeMyasoException("Тигр не ест " + s);
        } else {
            System.out.println("Тигр ест мясо ");
        }
    }

    void drink(String s) throws NeVodaException {
        if (!s.equals("вода")) {
            throw new NeVodaException("Тигр не пьет " + s);
        } else {
            System.out.println("Тигр пьет воду ");
        }
    }
}