package com.sandbox.Search_GB;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example of an application of a binary search algorithm
 * min, mid, and max value to determine the square root of a number. Starting point is the number entered divided
 * by two. A precision is used to determine when to stop guessing. Code is added to handle
 */
public class SquareRoot {

    public static double calculateFor(double operand) {
        return calculateFor(operand, 0.000000001);
    }

    public static double calculateFor(double operand, double precision) {

        // no negative number square root of a negative number is imaginary
        if (operand < 0) {
            return -1;
        }

        Datum datum = new Datum();
        Set<Double> guesses = new TreeSet<>();

        datum.min = 0.0;
        datum.max = operand;
        datum.mid = 0.0;
        datum.number = operand;
        datum.precision = precision;

        while (true) {
            // Iterate until an in-tolerance guess is made
            // calculate mid point
            datum.mid = (datum.min + datum.max) / 2.0;
            System.out.print("Guess: " + datum.mid + " ");

            // test for previous guess
            if (guesses.contains(datum.mid)) {
                System.out.println("Guess [" + datum.mid + "] is repeating - exiting");
                break;
            } else {
                guesses.add(datum.mid);
            }

            double guessSquared = Math.pow(datum.mid, 2.0);
            boolean outOfTolerance = outOfTolerance(datum);
            if (outOfTolerance && (guessSquared > operand)) {
                datum.max = datum.mid;
                System.out.println(" - Guess Too High - lowering max");
            } else if (outOfTolerance && (guessSquared < operand)) {
                datum.min = datum.mid;
                System.out.println(" - Guess Too Low - raising min");
            } else {
                System.out.println("\nGuess [" + datum.mid + "] is correct with [" + datum.precision + "] precision");
                break;
            }
        }

        return datum.mid;
    }

    private static boolean outOfTolerance(Datum datum) {
        return (datum.max - datum.min) > datum.precision;
    }

    /**
     * Class used to hold data related to root search/guess.
     */
    private static class Datum {
        double min;
        double mid;
        double max;
        double number;
        double precision;
    }
}