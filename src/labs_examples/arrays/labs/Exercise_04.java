package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // Populate array
        String[][] irregularTwoDArray = {{"Tick"}, {"Tick", "Tack"}, {"Tick", "Tack", "Toe"}};

        // Get longest word in array
        int length = 0;
        for (String[] oneDArray : irregularTwoDArray) {
            for (String word : oneDArray) {
                if (word.length() > length) {
                    length = word.length();
                }
            }
        }

        // Add padding to length
        length += 2;

        // Create string format
        StringBuilder builder = new StringBuilder();
        builder.append("%").append(length).append("s");

        // Print array
        for (String[] oneDArray : irregularTwoDArray) {
            for (String word : oneDArray) {
                System.out.printf(builder.toString(), word);
            }
            System.out.println();
        }
    }
}
