package lesson_007;

public class Main {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from cat thread");
            }
        }).start();
        System.out.println("Hello from main thread");

        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        for (int i = 0; i < 30; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " " + sequenceGenerator.generate());
                }
            }).start();
        }
    }
}