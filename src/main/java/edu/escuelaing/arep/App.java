package edu.escuelaing.arep;

import edu.escuelaing.arep.Utils.FileWrapper;
import edu.escuelaing.arep.Utils.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws Exception {
        LinkedList a = FileWrapper.getDataFromFile("src/main/resources/prueba.txt");

        System.out.println(StatisticalCalculator.calculateMean(a));

    }
}
