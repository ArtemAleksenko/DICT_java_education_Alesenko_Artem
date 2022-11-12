package Hangman;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("HANGMAN");

        System.out.print("Guess the word: ");
        String word = scanner.nextLine();

        var words = new ArrayList<String>();
        words.add("java");
        words.add("python");
        words.add("javascript");
        words.add("kotlin");
        words.trimToSize();
//        System.out.println(words);
//        System.out.println(words.size());
        int n = random.nextInt(words.size());
//        System.out.println(words.get(n));
        if (word.equals(words.get(n))) {
            System.out.println("You win");
        } else {
            System.out.println("You loss");
        }

    }
}
