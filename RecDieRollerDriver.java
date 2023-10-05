import java.util.Arrays;

/**
 * A class to test the recursive die roller class
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 3.1 - Recursive Die Roller
 * Fall/2023
 */

public class RecDieRollerDriver {

    /**
     * Main method to test other methods
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int[] rolls = rollMultiple(1000);
        String rollsToString = Arrays.toString(rolls); 
        double average = calculateAverage(rolls);
        System.out.println("Rolls List: " + rollsToString);
        System.out.println("Rolls Average: " + average);
    }

    /**
     * Runs the recursive die roll a certain amount of times
     * 
     * @param iterations The amount of times to roll the die
     * @return An array containing a list of how many rolls it took for each iteration
     */
    public static int[] rollMultiple(int iterations) {
        // I'm trying to learn the java stream API
        return Arrays.stream(new int[iterations])
                .map(i -> RecDieRoller.recRoll())
                .toArray();
    }

    /**
     * Calculates the average of a list of roll counts
     * 
     * @param rollCounts The list of rolls
     * @return The average of the all of the rolls
     */
    public static double calculateAverage(int[] rollCounts) {
        return Arrays.stream(rollCounts)
                .average()
                .orElse(0.0);
    }
}
