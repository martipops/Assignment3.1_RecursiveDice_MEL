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
        System.out.println(rollsToString);
    }

    /**
     * Runs the recursive die roll a certain amount of times
     * 
     * @param iterations The amount of times to roll the die
     * @return An array containing a list of how many rolls it took for each iteration
     */
    public static int[] rollMultiple(int iterations) {
        int[] rollCounts = new int[iterations];
        for (int i = 0; i < iterations; i++) {
            rollCounts[i] = RecDieRoller.recRoll();
        }
        return rollCounts;
    }
}
