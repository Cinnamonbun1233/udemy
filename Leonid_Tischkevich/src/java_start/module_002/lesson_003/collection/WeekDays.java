package java_start.module_002.lesson_003.collection;

public enum WeekDays {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int dayNumberOfWeek;

    WeekDays(int dayNumberOfWeek) {
        this.dayNumberOfWeek = dayNumberOfWeek;
    }

    public int getDayNumberOfWeek() {
        return dayNumberOfWeek;
    }

    public void setDayNumberOfWeek(int dayNumberOfWeek) {
        this.dayNumberOfWeek = dayNumberOfWeek;
    }
}