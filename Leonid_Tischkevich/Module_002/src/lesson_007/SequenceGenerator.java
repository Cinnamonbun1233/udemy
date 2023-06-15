package lesson_007;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private final AtomicInteger number = new AtomicInteger();

    public int generate() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number.incrementAndGet();
    }
}