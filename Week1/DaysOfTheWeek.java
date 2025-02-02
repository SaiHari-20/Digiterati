package Week1;

public class DaysOfTheWeek {
    // Define an enum for the days of the week

    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        printDayType(DaysOfWeek.MONDAY);
        printDayType(DaysOfWeek.SATURDAY);
        printDayType(DaysOfWeek.THURSDAY);
        printDayType(DaysOfWeek.SUNDAY);

    }

    private static void printDayType(DaysOfWeek day) {
        // Method to print whether the day is a holiday or not
        switch (day) {

            case SATURDAY, SUNDAY ->
                System.out.println(day + "is a Holiday");
            default ->
                System.out.println(day + "is not a Holiday");
        }

    }

}
