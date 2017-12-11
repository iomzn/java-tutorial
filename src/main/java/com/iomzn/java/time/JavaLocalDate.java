package com.iomzn.java.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class JavaLocalDate {

    public static void main(String[] args) {
        // constant
        LocalDate c01 = LocalDate.MIN; // -999999999-01-01
        LocalDate c02 = LocalDate.MAX; // +999999999-12-31
        LocalDate c03 = LocalDate.EPOCH; // 1970-01-01

        // instance
        LocalDate v01 = LocalDate.now(); // demo: 2017-12-08
        LocalDate v02 = LocalDate.now(Clock.systemUTC()); // demo: 2017-12-08
        LocalDate v03 = LocalDate.now(ZoneId.of("Z")); // demo: 2017-12-08
        LocalDate v04 = LocalDate.of(1991, 2, 25); // 1991-02-25
        LocalDate v05 = LocalDate.of(1991, Month.FEBRUARY, 25); // 1991-02-25
        LocalDate v06 = LocalDate.ofEpochDay(1); // 1970-01-02
        LocalDate v07 = LocalDate.ofInstant(Instant.EPOCH, ZoneId.of("Z")); // 1970-01-01
        LocalDate v08 = LocalDate.ofYearDay(1991, 56); // 1991-02-25
        LocalDate v09 = LocalDate.parse("1991-02-25"); // 1991-02-25
        LocalDate v10 = LocalDate.parse("1991.02.25", DateTimeFormatter.ofPattern("yyyy.MM.dd")); // 1991-02-25
        LocalDate v11 = LocalDate.from(LocalDateTime.now()); // demo: 2017-12-08

        // example
        LocalDate localDate = LocalDate.of(1991, 2, 25); // 1991-02-25

        // plus|minus
        LocalDate p01 = localDate.plusDays(1); // 1991-02-26
        LocalDate p02 = localDate.plusWeeks(1); // 1991-03-04
        LocalDate p03 = localDate.plusMonths(1); // 1991-03-25
        LocalDate p04 = localDate.plusYears(1); // 1992-02-25
        LocalDate p05 = localDate.plus(Period.ofDays(1)); // 1991-02-26
        LocalDate p06 = localDate.plus(1, ChronoUnit.DAYS); // 1991-02-26

        // with
        LocalDate w01 = localDate.withDayOfMonth(1); // 1991-02-01
        LocalDate w02 = localDate.withMonth(1); // 1991-01-25
        LocalDate w03 = localDate.withYear(1); // 0001-02-25
        LocalDate w04 = localDate.with(ChronoField.DAY_OF_MONTH, 1); // 1991-02-01
        LocalDate w05 = localDate.with(temporal -> temporal.with(ChronoField.DAY_OF_MONTH, 1)); // 1991-02-01
        LocalDate w06 = localDate.with(TemporalAdjusters.firstDayOfMonth()); // 1991-02-01

        // at
        LocalDateTime a01 = localDate.atStartOfDay(); // 1991-02-25T00:00
        ZonedDateTime a02 = localDate.atStartOfDay(ZoneId.of("Asia/Shanghai")); // 1991-02-25T00:00+08:00[Asia/Shanghai]
        LocalDateTime a03 = localDate.atTime(10, 10); // 1991-02-25T10:10
        LocalDateTime a04 = localDate.atTime(10, 10, 10); // 1991-02-25T10:10:10
        LocalDateTime a05 = localDate.atTime(10, 10, 10, 10); // 1991-02-25T10:10:10.000000010
        LocalDateTime a06 = localDate.atTime(LocalTime.of(10, 10)); // 1991-02-25T10:10
        OffsetDateTime a07 = localDate.atTime(OffsetTime.of(LocalTime.of(10, 10), ZoneOffset.ofHours(8))); // 1991-02-25T10:10+08:00

        // to
        long epochDay = localDate.toEpochDay(); // 7725
        long epochSecond = localDate.toEpochSecond(LocalTime.of(10, 10), ZoneOffset.ofHours(8)); // 667447800
    }
}
