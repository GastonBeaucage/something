package q2;

import java.util.Scanner;
/**
 * <p>
 * This program converts the number of seconds input by the user to hours mins 
 * and seconds in the form of hh:mm:ss.</p>
 *
 * @author Gaston Beaucage
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        final int secondsPerHour = 3600;
        final int secondsPerMinute = 60;
        
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;
        
        int inputInSeconds;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program converts the number of seconds "
                + "that the use inputs into hours minutes and seconds\n"
                + "in the form of hh:mm:ss and prints out the result\n");
        System.out.print("Please enter the number of seconds "
                + "you would like to convert: ");
        inputInSeconds = scan.nextInt();
        
        numberOfHours = inputInSeconds / secondsPerHour;
        inputInSeconds %= secondsPerHour;
        numberOfMinutes = inputInSeconds / secondsPerMinute;
        inputInSeconds %= secondsPerMinute;
        numberOfSeconds = inputInSeconds;
        
        System.out.println("The time you input was: " 
                + numberOfHours + ":" 
                + numberOfMinutes + ":" 
                + numberOfSeconds);
        
        System.out.println("Question two was called and ran sucessfully.");
    }

};
