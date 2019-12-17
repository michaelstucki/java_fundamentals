package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hint: there is a helpful method in the String class called charAt() that you'll want to use
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        char c = 0;
        int i = 0;
        while (i < word.length()) {
            c = word.toLowerCase().charAt(i);
            if (c == 'a') {
                break;
            } else if (c == 'e') {
                break;
            } else if (c == 'i') {
                break;
            } else if (c == 'o') {
                break;
            } else if (c == 'u') {
                break;
            }
            i++;
        }
        System.out.println("Word: " + word + ", first vowel: " + c);
    }
}
