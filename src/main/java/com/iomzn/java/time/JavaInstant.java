package com.iomzn.java.time;

import java.time.Clock;
import java.time.Instant;

public class JavaInstant {

    public static void main(String[] args) {
        // constant
        Instant c01 = Instant.MIN; // -1000000000-01-01T00:00Z
        Instant c02 = Instant.MAX; // 1000000000-12-31T23:59:59.999999999Z
        Instant c03 = Instant.EPOCH; // 1970-01-01T00:00:00Z

        // instance
        Instant v01 = Instant.now(); // demo: 2017-12-07T09:11:44.084799Z
        Instant v02 = Instant.now(Clock.systemUTC()); // demo: 2017-12-07T10:28:15.029701Z
        Instant v03 = Instant.now();


        System.out.println(v02);













    }
}
