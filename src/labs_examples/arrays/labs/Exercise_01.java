package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        final int SIZE = 10;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] numbers = new int[SIZE];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            numbers[i] = number;
            sum += number;
        }

        double average = (double) sum / SIZE;

        System.out.print("Numbers entered: ");
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
        System.out.println();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }

}