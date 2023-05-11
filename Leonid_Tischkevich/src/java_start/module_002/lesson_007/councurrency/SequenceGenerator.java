package java_start.module_002.lesson_007.councurrency;

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