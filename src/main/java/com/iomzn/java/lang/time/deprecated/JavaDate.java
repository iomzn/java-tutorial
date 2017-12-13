package com.iomzn.java.lang.time.deprecated;

import java.time.Instant;
import java.util.Date;

public class JavaDate {

    public static void main(String[] args) {
        // instance
        Date v01 = new Date(); // demo: 1512731601464
        Date v02 = new Date(1); // 1
        Date v03 = Date.from(Instant.EPOCH); // 0

        // example
        Date date = Date.from(Instant.EPOCH); // 0

        // getter
        long currentTimeMillis = date.getTime(); // 0

        // before|after
        // date.before();

        // setter
        date.setTime(1); // 1

        // convert
        Instant instant = date.toInstant(); // 1970-01-01T00:00:00.001Z




        System.out.println(instant);


    }
}
