/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import Utility.Constants;

/**
 *
 * @author Sai Hari
 */
public class DaysOfTheWeek {
    // Define an enum for the days of the week

    enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        printDayInfo(DaysOfWeek.MONDAY);
        printDayInfo(DaysOfWeek.SATURDAY);
        printDayInfo(DaysOfWeek.THURSDAY);
        printDayInfo(DaysOfWeek.SUNDAY);

    }

    //Method to print whether the day is a holiday or not
    private static void printDayInfo(DaysOfWeek day) {

        switch (day) {
            case SATURDAY, SUNDAY ->
                System.out.println(day + Constants.HOLIDAY);
            default ->
                System.out.println(day + Constants.NOT_HOLIDAY);
        }

    }
}
