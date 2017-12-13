package com.iomzn.java.lang.time;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class JavaDuration {

    public static void main(String[] args) {
        // constant
        Duration c01 = Duration.ZERO;

        // instance
        Duration v01 = Duration.of(1, ChronoUnit.SECONDS); // PT1S
        Duration v02 = Duration.ofNanos(1); // PT0.000000001S
        Duration v03 = Duration.ofMillis(1); // PT0.001S
        Duration v04 = Duration.ofSeconds(1); // PT1S
        Duration v05 = Duration.ofSeconds(1, 1); // PT1.000000001S
        Duration v06 = Duration.ofMinutes(1); // PT1M
        Duration v07 = Duration.ofHours(1); // PT1H
        Duration v08 = Duration.ofDays(1); // PT24H
        Duration v09 = Duration.parse("P1DT1H1M1.000000001S"); // PT25H1M1.000000001S
        Duration v10 = Duration.from(Duration.ZERO); // PT0S




    }
}
