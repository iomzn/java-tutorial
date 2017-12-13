package com.iomzn.java.lang.time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class JavaDayOfWeek {

    public static void main(String[] args) {
        // instance
        DayOfWeek v01 = DayOfWeek.MONDAY;
        DayOfWeek v02 = DayOfWeek.TUESDAY;
        DayOfWeek v03 = DayOfWeek.WEDNESDAY;
        DayOfWeek v04 = DayOfWeek.THURSDAY;
        DayOfWeek v05 = DayOfWeek.FRIDAY;
        DayOfWeek v06 = DayOfWeek.SATURDAY;
        DayOfWeek v07 = DayOfWeek.SUNDAY;
        DayOfWeek v08 = DayOfWeek.of(1); // MONDAY
        DayOfWeek v09 = DayOfWeek.valueOf("MONDAY"); // MONDAY
        DayOfWeek v10 = DayOfWeek.from(LocalDate.of(1991, 2, 25)); // MONDAY
        DayOfWeek[] v11 = DayOfWeek.values();

        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;

        // getter
        int dayOfWeekValue = dayOfWeek.getValue(); // 1

        // plus|minus
        DayOfWeek p01 = dayOfWeek.plus(1); // TUESDAY
    }
}
