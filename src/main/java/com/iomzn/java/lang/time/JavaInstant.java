package com.iomzn.java.lang.time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class JavaInstant {

    public static void main(String[] args) {
        // constant
        Instant c01 = Instant.MIN; // -1000000000-01-01T00:00Z
        Instant c02 = Instant.MAX; // 1000000000-12-31T23:59:59.999999999Z
        Instant c03 = Instant.EPOCH; // 1970-01-01T00:00:00Z

        // instance
        Instant v01 = Instant.now(); // demo: 2017-12-07T09:11:44.084799Z
        Instant v02 = Instant.now(Clock.systemUTC()); // demo: 2017-12-07T10:28:15.029701Z
        Instant v03 = Instant.ofEpochMilli(1); // 1970-01-01T00:00:00.001Z
        Instant v04 = Instant.ofEpochSecond(1); // 1970-01-01T00:00:01Z
        Instant v05 = Instant.ofEpochSecond(1, 1); // 1970-01-01T00:00:01.000000001Z
        Instant v06 = Instant.from(ZonedDateTime.now()); // demo: 2017-12-07T11:04:48.612724Z
        Instant v07 = Instant.parse("1970-01-01T00:00:00Z"); // 1970-01-01T00:00:00Z

        Instant instant = Instant.EPOCH; // 1970-01-01T00:00:00Z

        // plus|minus
        Instant p01 = instant.plusNanos(1); // 1970-01-01T00:00:00.000000001Z
        Instant p02 = instant.plusMillis(1); // 1970-01-01T00:00:00.001Z
        Instant p03 = instant.plusSeconds(1); // 1970-01-01T00:00:01Z
        Instant p04 = instant.plus(Duration.ofSeconds(1)); // 1970-01-01T00:00:01Z
        Instant p05 = instant.plus(1, ChronoUnit.SECONDS); // 1970-01-01T00:00:01Z ~ []

















    }
}
