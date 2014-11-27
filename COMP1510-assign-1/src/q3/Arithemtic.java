package q3;

import java.util.Scanner;

/**
 * <p>This program takes two numbers and takes the sum, difference, 
 * product and quotient of the two number and prints out the result.</p>
 *
 * @author Gaston Beaucage
 * @version 1.0
 */
public class Arithemtic {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        double floatingInput1;
        double floatingInput2;
        
        double sumOfInputs;
        double differenceOfInputs;
        double productOfInputs;
        double quotientOfInputs;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program reads to floating point "
                + "numbers from the user and performs arithmetic"
                + "on them\n");
        
        System.out.println("Please enter two floating point numbers");
        System.out.print("Floating point 1: ");
        floatingInput1 = scan.nextDouble();
        System.out.print("Floating point 2: ");
        floatingInput2 = scan.nextDouble();
        
        sumOfInputs = floatingInput1 + floatingInput2;
        differenceOfInputs = floatingInput1 - floatingInput2;
        productOfInputs = floatingInput1 * floatingInput2;
        quotientOfInputs = floatingInput1 / floatingInput2;
        
        System.out.println("The sum of the inputs: " + sumOfInputs);
        System.out.println("The difference of the inputs: "
                + differenceOfInputs);
        System.out.println("The product of the inputs: "
                + productOfInputs);
        System.out.println("The quotient of the inputs: "
                + quotientOfInputs);
        
        System.out.println("Question three was called and ran sucessfully.");
    }

};
