package q1;

import java.util.Scanner;
/**
 * <p>This program splits up the amount of money input by the user to the 
 * least amount of bills that could represent the value of money input.
 * </p>
 *
 * @author Gaston Beaucage
 * @version 1.0
 */
public class Change {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        final int tenDollarsInCents = 1000;
        final int fiveDollarsInCents = 500;
        final int twooniesInCents = 200;
        final int looniesInCents = 100;
        final int quartersInCents = 25;
        final int dimesInCents = 10;
        final int nicklesInCents = 5;
        final int penniesInCents = 1;
        
        final int centsPerDollar = 100;
        
        int numberOfTenDollarBills;
        int numberOfFiveDollarBills;
        int numberOfTwoonies;
        int numberOfLoonies;
        int numberOfQuarters;
        int numberOfDimes;
        int numberOfNickles;
        int numberOfPennies;
        
        double dollarCentsInput;
        int inputInCents;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program converts an amount of money to the "
                + "least amount of bills and coins needed to represent "
                + "the value.\n");
        System.out.print("Please enter the amount you want to "
                + "convert in the form of \"DOLLARS.CENTS\":");
        
        dollarCentsInput = scan.nextDouble();
        inputInCents = (int) (dollarCentsInput * centsPerDollar);
        
        numberOfTenDollarBills = inputInCents / tenDollarsInCents;
        inputInCents %= tenDollarsInCents;
        numberOfFiveDollarBills = inputInCents / fiveDollarsInCents;
        inputInCents %= fiveDollarsInCents;
        numberOfTwoonies = inputInCents / twooniesInCents;
        inputInCents %= twooniesInCents;
        numberOfLoonies = inputInCents / looniesInCents;
        inputInCents %= looniesInCents;
        numberOfQuarters = inputInCents / quartersInCents;
        inputInCents %= quartersInCents;
        numberOfDimes = inputInCents / dimesInCents;
        inputInCents %= dimesInCents;
        numberOfNickles = inputInCents / nicklesInCents;
        inputInCents %= nicklesInCents;
        numberOfPennies = inputInCents / penniesInCents;
        
        System.out.println(numberOfTenDollarBills + " ten dollar bills");
        System.out.println(numberOfFiveDollarBills + " five dollar bills");
        System.out.println(numberOfTwoonies + " two dollar coin");
        System.out.println(numberOfLoonies + " one dollar coin");
        System.out.println(numberOfQuarters + " quarters");
        System.out.println(numberOfDimes + " dimes");
        System.out.println(numberOfNickles + " nickles");
        System.out.println(numberOfPennies + " pennies");
        
        System.out.println("Question one was called and ran sucessfully.");
    }

};
