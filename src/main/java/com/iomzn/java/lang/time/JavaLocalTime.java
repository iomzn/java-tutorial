package com.iomzn.java.lang.time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class JavaLocalTime {

    public static void main(String[] args) {
        // constant
        LocalTime c01 = LocalTime.MIN; // 00:00
        LocalTime c02 = LocalTime.MAX; // 23:59:59.999999999
        LocalTime c03 = LocalTime.MIDNIGHT; // 00:00
        LocalTime c04 = LocalTime.NOON; // 12:00

        // instance
        LocalTime v01 = LocalTime.now(); // demo: 17:25:35.377539
        LocalTime v02 = LocalTime.now(Clock.systemUTC()); // demo: 09:25:35.377952
        LocalTime v03 = LocalTime.now(ZoneId.of("Z")); // demo: 09:25:35.378007
        LocalTime v04 = LocalTime.of(10, 10); // 10:10
        LocalTime v05 = LocalTime.of(10, 10, 10); // 10:10:10
        LocalTime v06 = LocalTime.of(10, 10, 10, 10); // 10:10:10.000000010
        LocalTime v07 = LocalTime.ofInstant(Instant.EPOCH, ZoneId.of("Z")); // 00:00
        LocalTime v08 = LocalTime.ofNanoOfDay(10); // 00:00:00.000000010
        LocalTime v09 = LocalTime.ofSecondOfDay(10); // 00:00:10
        LocalTime v10 = LocalTime.parse("10:10:10.000000010"); // 10:10:10.000000010
        LocalTime v11 = LocalTime.parse("10.10.10.000000010", DateTimeFormatter.ofPattern("HH.mm.ss.nnnnnnnnn")); // 10:10:10.000000010
        LocalTime v12 = LocalTime.from(LocalDateTime.now()); // demo: 17:35:49.118439

        // example
        LocalTime localTime = LocalTime.of(10, 10, 10, 10); // 10:10:10.000000010

        // plus|minus
        LocalTime p01 = localTime.plusNanos(1); // 10:10:10.000000011
        LocalTime p02 = localTime.plusSeconds(1); // 10:10:11.000000010
        LocalTime p03 = localTime.plusMinutes(1); // 10:11:10.000000010
        LocalTime p04 = localTime.plusHours(1); // 11:10:10.000000010
        LocalTime p05 = localTime.plus(Duration.ofNanos(1)); // 10:10:10.000000011
        LocalTime p06 = localTime.plus(1, ChronoUnit.NANOS); // 10:10:10.000000011

        // with
        LocalTime w01 = localTime.withNano(1); // 10:10:10.000000001
        LocalTime w02 = localTime.withSecond(1); // 10:10:01.000000010
        LocalTime w03 = localTime.withMinute(1); // 10:01:10.000000010
        LocalTime w04 = localTime.withHour(1); // 01:10:10.000000010
        LocalTime w05 = localTime.with(ChronoField.NANO_OF_SECOND, 1); // 10:10:10.000000001
        LocalTime w06 = localTime.with(temporal -> temporal.with(ChronoField.NANO_OF_SECOND, 1)); // 10:10:10.000000001

        // at
        LocalDateTime a01 = localTime.atDate(LocalDate.of(1991, 2, 25)); // 1991-02-25T10:10:10.000000010
        OffsetTime a02 = localTime.atOffset(ZoneOffset.UTC); // 10:10:10.000000010Z

        // to
        long nanoOfDay = localTime.toNanoOfDay(); // 36610000000010
        int secondOfDay = localTime.toSecondOfDay(); // 36610
        long epochSecond = localTime.toEpochSecond(LocalDate.of(1991, 2, 25), ZoneOffset.UTC); // 667476610
    }
}
