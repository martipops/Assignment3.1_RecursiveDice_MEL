import java.util.Random;
/**
 * A class containing the recursive function for rolling a die
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 3.1 - Recursive Die Roller
 * Fall/2023
 */
public class RecDieRoller {
    public static Random rand = new Random();

    /**
     * Rolls a 6-sided die until it lands on two.
     * 
     * @return The amount of rolls it took to get two
     */
    public static int recRoll() {
        int r = rand.nextInt(1,7);
        System.out.println("Roll: " + r);
        if (r==2)
            return 1;
        return 1 + recRoll();
    }

}
