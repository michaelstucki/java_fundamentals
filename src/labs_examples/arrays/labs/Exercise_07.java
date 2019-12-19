package labs_examples.arrays.labs;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) throws IOException {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<String> playList = new ArrayList<>();

        // Get user songs to add to playList
        while (true) {
            System.out.print("Enter song to add to play list [or quit]: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            } else {
                playList.add(input);
            }
        }

        // Print playList
        for (String song : playList) {
            System.out.println(song);
        }
    }
}
