package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // Create and populate array
        String[] words = {"King", "Queen", "Rook", "Knight", "Bishop", "Pawn"};

        // Print array in reverse order
        for (int i = words.length - 1; i > -1; i--) {
            System.out.println(words[i]);
        }
    }
}
