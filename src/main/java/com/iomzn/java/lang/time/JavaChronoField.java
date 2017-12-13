package com.iomzn.java.lang.time;

import java.time.temporal.ChronoField;

public class JavaChronoField {

    public static void main(String[] args) {
        // instance
        ChronoField v01 = ChronoField.NANO_OF_SECOND; // TimeBased|0 - 999999999
        ChronoField v02 = ChronoField.NANO_OF_DAY; // TimeBased|0 - 86399999999999
        ChronoField v03 = ChronoField.MICRO_OF_SECOND; // TimeBased|0 - 999999
        ChronoField v04 = ChronoField.MICRO_OF_DAY; // TimeBased|0 - 86399999999
        ChronoField v05 = ChronoField.MILLI_OF_SECOND; // TimeBased|0 - 999
        ChronoField v06 = ChronoField.MILLI_OF_DAY; // TimeBased|0 - 86399999
        ChronoField v07 = ChronoField.SECOND_OF_MINUTE; // TimeBased|0 - 59
        ChronoField v08 = ChronoField.SECOND_OF_DAY; // TimeBased|0 - 86399
        ChronoField v09 = ChronoField.MINUTE_OF_HOUR; // TimeBased|0 - 59
        ChronoField v10 = ChronoField.MINUTE_OF_DAY; // TimeBased|0 - 1439
        ChronoField v11 = ChronoField.HOUR_OF_AMPM; // TimeBased|0 - 11
        ChronoField v12 = ChronoField.CLOCK_HOUR_OF_AMPM; // TimeBased|1 - 12
        ChronoField v13 = ChronoField.HOUR_OF_DAY; // TimeBased|0 - 23
        ChronoField v14 = ChronoField.CLOCK_HOUR_OF_DAY; // TimeBased|1 - 24
        ChronoField v15 = ChronoField.AMPM_OF_DAY; // TimeBased|0(AM) - 1(PM)
        ChronoField v16 = ChronoField.DAY_OF_WEEK; // DateBased|1(Monday) - 7(Sunday)
        ChronoField v17 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH; // DateBased|1 - 7
        ChronoField v18 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR; // DateBased|1 - 7
        ChronoField v19 = ChronoField.DAY_OF_MONTH; // DateBased|1 - 28/31
        ChronoField v20 = ChronoField.DAY_OF_YEAR; // DateBased|1 - 365/366
        ChronoField v21 = ChronoField.EPOCH_DAY; // DateBased|-365243219162 - 365241780471
        ChronoField v22 = ChronoField.ALIGNED_WEEK_OF_MONTH; // DateBased|1 - 4/5
        ChronoField v23 = ChronoField.ALIGNED_WEEK_OF_YEAR; // DateBased|1 - 53
        ChronoField v24 = ChronoField.MONTH_OF_YEAR; // DateBased|1(January) - 12(December)
        ChronoField v25 = ChronoField.PROLEPTIC_MONTH; // DateBased|-11999999988 - 11999999999
        ChronoField v26 = ChronoField.YEAR_OF_ERA; // DateBased|1 - 999999999/1000000000
        ChronoField v27 = ChronoField.YEAR; // DateBased| -999999999 - 999999999
        ChronoField v28 = ChronoField.ERA; // DateBased|0(BCE) - 1(CE)
        ChronoField v29 = ChronoField.INSTANT_SECONDS; // -9223372036854775808 - 9223372036854775807
        ChronoField v30 = ChronoField.OFFSET_SECONDS; // -64800 - 64800
    }
}
