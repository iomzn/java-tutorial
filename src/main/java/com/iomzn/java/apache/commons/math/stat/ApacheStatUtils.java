package com.iomzn.java.apache.commons.math.stat;

import org.apache.commons.math3.stat.StatUtils;

public class ApacheStatUtils {

    public static void main(String[] args) {
        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] sample = {1.1, 2.2, 3.3, 4.4, 5.5};

        // min - 最小值
        double min01 = StatUtils.min(values); // 1.0
        double min02 = StatUtils.min(values, 2, 3); // 3.0

        // max - 最大值
        double max01 = StatUtils.max(values); // 5.0
        double max02 = StatUtils.max(values, 2, 3); // 5.0

        // sum - 和
        double sum01 = StatUtils.sum(values); // 15.0 = 1.0 + 2.0 + 3.0 + 4.0 + 5.0
        double sum02 = StatUtils.sum(values, 2, 3); // 12.0 = 3.0 + 4.0 + 5.0
        double sum03 = StatUtils.sumSq(values); // 55.0 = 1.0² + 2.0² + 3.0² + 4.0² + 5.0²
        double sum04 = StatUtils.sumSq(values, 2, 3); // 50.0 = 3.0² + 4.0² + 5.0²
        double sum05 = StatUtils.sumLog(values); // 4.787491742782046 = ㏑1.0 + ㏑2.0 + ㏑3.0 + ㏑4.0 + ㏑5.0
        double sum06 = StatUtils.sumLog(values, 2, 3); // 4.0943445622221 = ㏑3.0 + ㏑4.0 + ㏑5.0
        double sum07 = StatUtils.sumDifference(values, sample); // -1.5000000000000004 = (1.0 - 1.1) + (2.0 - 2.2) + (3.0 - 3.3) + (4.0 - 4.4) + (5.0 - 5.5)

        // mean - 平均值(算术平均值|几何平均值)
        double mean01 = StatUtils.mean(values); // 3.0 = (1.0 + 2.0 + 3.0 + 4.0 + 5.0) / 5
        double mean02 = StatUtils.mean(values, 2, 3); // 4.0 = (3.0 + 4.0 + 5.0) / 5
        double mean03 = StatUtils.geometricMean(values); // 2.6051710846973517 = 5√(1.0 * 2.0 * 3.0 * 4.0 * 5.0)
        double mean04 = StatUtils.geometricMean(values, 2, 3); // 3.9148676411688634 = 3√(3.0 * 4.0 * 5.0)
        double mean05 = StatUtils.meanDifference(values, sample); // -0.3000000000000001 = ((1.0 - 1.1) + (2.0 - 2.2) + (3.0 - 3.3) + (4.0 - 4.4) + (5.0 - 5.5)) / 5

        // product - 乘积
        double product01 = StatUtils.product(values); // 120.0 = 1.0 * 2.0 * 3.0 * 4.0 * 5.0
        double product02 = StatUtils.product(values, 2, 3); // 60.0 = 3.0 * 4.0 * 5.0

        // variance - 方差(样本方差|总体方差)
        double variance01 = StatUtils.variance(values); // 2.5 = ((1.0 - 3.0)² + (2.0 - 3.0)²  + (3.0 - 3.0)²  + (4.0 - 3.0)²  + (5.0 - 3.0)²) / (5 - 1)
        double variance02 = StatUtils.variance(values, 2, 3); // 1.0 = ((3.0 - 4.0)² + (4.0 - 4.0)² + (5.0 - 4.0)²) / (3 - 1)
        double variance03 = StatUtils.variance(values, 3.0); // 2.5 - note: mean provided only to save computation
        double variance04 = StatUtils.variance(values, 4.0, 2, 3); // 1.0 - note: mean provided only to save computation
        double variance05 = StatUtils.populationVariance(values); // 2.0 = ((1.0 - 3.0)² + (2.0 - 3.0)²  + (3.0 - 3.0)²  + (4.0 - 3.0)²  + (5.0 - 3.0)²) / 5
        double variance06 = StatUtils.populationVariance(values, 2, 3); // 0.6666666666666666 = ((3.0 - 4.0)² + (4.0 - 4.0)² + (5.0 - 4.0)²) / 3
        double variance07 = StatUtils.populationVariance(values, 3.0); // 2.0 - note: mean provided only to save computation
        double variance08 = StatUtils.populationVariance(values, 4.0, 2, 3); // 0.6666666666666666 - note: mean provided only to save computation
        // double variance09 = StatUtils.varianceDifference(values, sample, meanDifference);

        // normalize - 归一化(算术平均值=0, 标准差=1)
        double[] normalize = StatUtils.normalize(values); // [-1.2649110640673518, -0.6324555320336759, 0.0, 0.6324555320336759, 1.2649110640673518]

        // percentile - 百分位
        double percentile01 = StatUtils.percentile(values, 60.0); // 3.5999999999999996
        double percentile02 = StatUtils.percentile(values, 2, 3, 60.0); // 4.4

        // mode - the most frequently occurring value
        double[] mode01 = StatUtils.mode(new double[]{1.0, 2.0, 2.0, 4.0, 4.0}); // [2.0, 4.0]
        double[] mode02 = StatUtils.mode(new double[]{1.0, 2.0, 2.0, 4.0, 4.0}, 2, 3); // [4.0]
    }
}
