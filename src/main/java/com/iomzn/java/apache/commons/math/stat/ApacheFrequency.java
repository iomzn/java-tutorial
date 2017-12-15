package com.iomzn.java.apache.commons.math.stat;

import org.apache.commons.math3.stat.Frequency;

import java.util.List;

public class ApacheFrequency {

    public static void main(String[] args) {
        Frequency frequency = new Frequency(); // int|char|long|String|Comparable
        frequency.addValue(1);
        frequency.addValue(1);
        frequency.addValue(1);
        frequency.addValue(2);
        frequency.addValue(3);

        long count = frequency.getCount(1); // 3
        double pct = frequency.getPct(1); // 0.6 (=1)
        long cumFreq = frequency.getCumFreq(2); // 4 (<=2)
        double cumPct = frequency.getCumPct(2); // 0.8 (<=2)
        long sumFreq = frequency.getSumFreq(); // 5
        long uniqueCount = frequency.getUniqueCount(); // 3
        List<Comparable<?>> modeList = frequency.getMode(); // [1]
    }
}
