package JavaForBeginners.Lessons.Lesson_28;

public class Test8 {

    void marathon(int temperature, int speed) throws TwistedLegException {
        if (speed > 12) {
            throw new TwistedLegException("Темп бега был слишком высоким: " + speed);
        }
        if (temperature > 32) {
            throw new CrampedMuscleException("Температура была слишком высокая: " + temperature);
        }
        System.out.println("Вы пробежали марафон!");
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        try {
            t.marathon(40,8 );
        } catch (TwistedLegException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("В любом случае вы получите грамоту!");
        }
    }
}

class TwistedLegException extends Exception {
    TwistedLegException(String message) {
        super(message);
    }
}

class CrampedMuscleException extends RuntimeException {

    CrampedMuscleException(String message) {
        super(message);
    }
}