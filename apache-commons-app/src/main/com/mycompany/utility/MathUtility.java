package com.mycompany.utility;

import org.apache.commons.math3.analysis.function.Exp;
import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

public class MathUtility implements ApacheCommons {
    @Override
    public void evaluate() {
        double x = 2.0;
        Exp expFunction = new Exp();
        double result = expFunction.value(x);
        System.out.println("e^"+x+" = "+result);

        SummaryStatistics stats = new SummaryStatistics();
        double[] values = {10.5,15.2,20.7,5.9,12.4};
        for(double value: values) {
            stats.addValue(value);
        }
        double mean = stats.getMean();
        double standardDeviation = stats.getStandardDeviation();
        System.out.println("Mean: "+mean);
        System.out.println("Standard Deviation: "+standardDeviation);
    }
}
