package Hangman;

import java.util.Objects;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the word: ");
        String word = scanner.nextLine();
        if (word.equals("java")) {
            System.out.println("You win");
        } else {
            System.out.println("You loss");
        }
    }
}
