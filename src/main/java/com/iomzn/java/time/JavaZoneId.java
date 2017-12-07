package com.iomzn.java.time;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class JavaZoneId {

    public static void main(String[] args) {
        // instance
        ZoneId v01 = ZoneId.of("Z"); // Z
        ZoneId v02 = ZoneId.of("+08:00"); // +08:00
        ZoneId v03 = ZoneId.of("GMT"); // GMT ~ [GMT|UTC|UT]=Z
        ZoneId v04 = ZoneId.of("GMT+08:00"); // GMT+08:00 ~ [GMT+|GMT-|UTC+|UTC-|UT+|UT-]
        ZoneId v05 = ZoneId.of("Asia/Shanghai"); // Asia/Shanghai
        ZoneId v06 = ZoneId.of("CTT", ZoneId.SHORT_IDS); // Asia/Shanghai
        ZoneId v07 = ZoneId.ofOffset("", ZoneOffset.ofHours(8)); // +08:00
        ZoneId v08 = ZoneId.ofOffset("GMT", ZoneOffset.ofHours(8)); // GMT+08:00 ~ [GMT|UTC|UT]
        ZoneId v09 = ZoneId.from(ZonedDateTime.now()); // demo: Asia/Shanghai
        ZoneId v10 = ZoneId.systemDefault(); // demo: Asia/Shanghai

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds(); // [Asia/Aden, America/Cuiaba, ...]
    }
}
