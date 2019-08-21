package edu.escuelaing.arep;

import edu.escuelaing.arep.Utils.FileWrapper;
import edu.escuelaing.arep.Utils.LinkedList;

/**
 *Simulates the statistical calculator.
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        LinkedList a = FileWrapper.getDataFromFile("src/main/resources/prueba.txt");
        double mean = StatisticalCalculator.calculateMean(a);
        double standardDeviation = StatisticalCalculator.calculateStandardDeviation(a, StatisticalCalculator.calculateMean(a));
        System.out.println("The mean is: " + String.format("%.2f", mean));
        System.out.println("The standard deviation is: " + String.format("%.2f", standardDeviation));

    }
}
