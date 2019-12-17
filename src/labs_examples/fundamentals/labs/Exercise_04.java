package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here

        // Cylinder dimensions
        double radius = 3.14;
        double height = 5.0;

        // Cylinder volume
        double cylinderVolume = Math.PI * radius * radius * height;
        System.out.println( "Cylinder Volume: " + cylinderVolume );

        // Cylinder surface area
        double cylinderSurfaceArea = ( 2 * Math.PI * radius * radius ) + ( 2 * Math.PI * radius * height );
        System.out.println( "Cylinder Surface Area: " + cylinderSurfaceArea );
    }
}
