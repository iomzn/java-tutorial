package com.iomzn.java.time;

import java.time.LocalDate;
import java.time.Month;

public class JavaMonth {

    public static void main(String[] args) {
        // instance
        Month v01 = Month.JANUARY;
        Month v02 = Month.FEBRUARY;
        Month v03 = Month.MARCH;
        Month v04 = Month.APRIL;
        Month v05 = Month.MAY;
        Month v06 = Month.JUNE;
        Month v07 = Month.JULY;
        Month v08 = Month.AUGUST;
        Month v09 = Month.SEPTEMBER;
        Month v10 = Month.OCTOBER;
        Month v11 = Month.NOVEMBER;
        Month v12 = Month.DECEMBER;
        Month v13 = Month.of(2); // FEBRUARY
        Month v14 = Month.valueOf("FEBRUARY"); // FEBRUARY
        Month v15 = Month.from(LocalDate.of(1991, 2, 25)); // FEBRUARY
        Month[] v16 = Month.values();

        Month month = Month.FEBRUARY;

        // getter
        int monthValue = month.getValue(); // 2
        int lengthIfLeapYear = month.length(true); // 29
        int lengthIfNotLeapYear = month.length(false); // 28

        // plus|minus
        Month p01 = month.plus(1); // MARCH
    }
}
