package com.iomzn.java.lang.time;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class JavaClock {

    public static void main(String[] args) {
        // instance
        Clock v01 = Clock.fixed(Instant.EPOCH, ZoneId.of("Asia/Shanghai")); // FixedClock[1970-01-01T00:00:00Z,Asia/Shanghai]
        Clock v02 = Clock.offset(Clock.systemUTC(), Duration.ofHours(1)); // OffsetClock[SystemClock[Z],PT1H]
        Clock v03 = Clock.system(ZoneId.of("Asia/Shanghai")); // SystemClock[Asia/Shanghai]
        Clock v04 = Clock.systemDefaultZone(); // demo: SystemClock[Asia/Shanghai]
        Clock v05 = Clock.systemUTC(); // SystemClock[Z]
        Clock v06 = Clock.tick(Clock.systemUTC(), Duration.ofSeconds(30)); // TickClock[SystemClock[Z],PT30S]
        Clock v07 = Clock.tickMillis(ZoneId.of("Z")); // TickClock[SystemClock[Z],PT0.001S]
        Clock v08 = Clock.tickSeconds(ZoneId.of("Z")); // TickClock[SystemClock[Z],PT1S]
        Clock v09 = Clock.tickMinutes(ZoneId.of("Z")); // TickClock[SystemClock[Z],PT1M]

        Clock clock = Clock.fixed(Instant.EPOCH, ZoneId.of("Asia/Shanghai")); // FixedClock[1970-01-01T00:00:00Z,Asia/Shanghai]

        // getter
        Instant instant = clock.instant(); // 1970-01-01T00:00:00Z
        ZoneId zoneId = clock.getZone(); // Asia/Shanghai
        long millis = clock.millis(); // 0

        // with
        Clock w01 = clock.withZone(ZoneId.of("Z")); // FixedClock[1970-01-01T00:00:00Z,Z]
    }
}
