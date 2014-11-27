package q4;

import java.util.Scanner;

/**
 * <p>This program takes the length of a side of a cube and calculates the
 * area and surface area of the cube. The result is printed out.</p>
 *
 * @author Gaston Beaucage
 * @version 1.0
 */
public class Cube {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        final int cubeFaces = 6;
        
        double inputSideLength;
        double cubeVolume;
        double cubeSurfaceArea;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("This program takes the length of one side"
                + " of a cube and outputs the volume and a surface area\n");
        System.out.print("Please input the length of the side of your "
                + "cube: ");
        inputSideLength = scan.nextDouble();
        
        cubeVolume = inputSideLength * inputSideLength * inputSideLength;
        cubeSurfaceArea = (inputSideLength * inputSideLength) * cubeFaces;
        
        System.out.println("The volume of the cube was: " + cubeVolume
                + " The surface area of the cube was: " + cubeSurfaceArea);
        
        System.out.println("Question four was called and ran sucessfully.");
    }

};
