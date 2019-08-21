package edu.escuelaing.arep;

import edu.escuelaing.arep.Utils.LinkedList;


public class StatisticalCalculator {

    /**
     * Calculate the mean value of the given data.
     *
     * @param data linkedList with the sample data.
     * @return mean of the given data.
     */
    public static double calculateMean(LinkedList data) throws Exception {
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }
        return sum / data.size();
    }

    /**
     * Calculate the standard deviation of the given data .
     *
     * @param data list with the sample data.
     * @param mean mean of the sample data.
     * @return standard deviation of the given data;
     */
    public static double calculateStandardDeviation(LinkedList data, double mean) throws Exception {
        float sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += (data.get(i) - mean) * (data.get(i) - mean);
        }
        return Math.sqrt(sum / (data.size() - 1));
    }
}
