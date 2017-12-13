package com.iomzn.java.lang.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JavaChronoUnit {

    public static void main(String[] args) {
        // instance
        ChronoUnit v01 = ChronoUnit.NANOS; // TimeBased|PT0.000000001S
        ChronoUnit v02 = ChronoUnit.MICROS; // TimeBased|PT0.000001S
        ChronoUnit v03 = ChronoUnit.MILLIS; // TimeBased|PT0.001S
        ChronoUnit v04 = ChronoUnit.SECONDS; // TimeBased|PT1S
        ChronoUnit v05 = ChronoUnit.MINUTES; // TimeBased|PT1M
        ChronoUnit v06 = ChronoUnit.HOURS; // TimeBased|PT1H
        ChronoUnit v07 = ChronoUnit.HALF_DAYS; // TimeBased|PT12H
        ChronoUnit v08 = ChronoUnit.DAYS; // DateBased|Estimated|PT24H
        ChronoUnit v09 = ChronoUnit.WEEKS; // DateBased|Estimated|PT168H
        ChronoUnit v10 = ChronoUnit.MONTHS; // DateBased|Estimated|PT730H29M6S
        ChronoUnit v11 = ChronoUnit.YEARS; // DateBased|Estimated|PT8765H49M12S
        ChronoUnit v12 = ChronoUnit.DECADES; //DateBased|Estimated|PT87658H12M
        ChronoUnit v13 = ChronoUnit.CENTURIES; // DateBased|Estimated|PT876582H
        ChronoUnit v14 = ChronoUnit.MILLENNIA; // DateBased|Estimated|PT8765820H
        ChronoUnit v15 = ChronoUnit.ERAS; // DateBased|Estimated|PT8765820000000H
        ChronoUnit v16 = ChronoUnit.FOREVER; // Estimated|PT2562047788015215H30M7.999999999S

        ChronoUnit chronoUnit = ChronoUnit.DAYS;

        // getter
        Duration duration = chronoUnit.getDuration(); // PT24H

        // condition
        boolean isDateBased = chronoUnit.isDateBased(); // true
        boolean isTimeBased = chronoUnit.isTimeBased(); // false
        boolean isDurationEstimated = chronoUnit.isDurationEstimated(); // true
        boolean isSupportedBy = chronoUnit.isSupportedBy(LocalDate.now()); // true

        // calculate
        long daysBetween = chronoUnit.between(LocalDate.of(1991, 2, 25), LocalDate.now()); // demo: 9783
    }
}
