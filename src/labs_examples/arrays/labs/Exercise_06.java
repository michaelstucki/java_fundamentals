package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06 {

    public static void main(String[] args) {

        // Create and populate an array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Print the array
        System.out.println("Original Array");
        for (int number : numbers) {
            System.out.printf("%3d", number);
        }

        // Reverse the array
        int temp;
        for (int i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print the array
        System.out.println("\nSorted Array");
        for (int number : numbers) {
            System.out.printf("%3d", number);
        }
    }
}
