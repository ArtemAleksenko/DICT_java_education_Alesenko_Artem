package Hangman;

import java.util.*;

public class hangman {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("HANGMAN");

        var words = new ArrayList<String>();
        words.add("java");
        words.add("python");
        words.add("javascript");
        words.add("kotlin");
        words.trimToSize();

        String[] w = new String[]{};
        String randomWord = words.get(random.nextInt(words.size()));
        w = randomWord.split("");
//        System.out.println(Arrays.toString(w));

        System.out.print("Guess the word " + w[0]+w[1]);
        for (int i = 2; i < w.length; i++){
            System.out.print("-");
        }

        System.out.print(" : ");

        String word = scanner.nextLine();
        if (word.equals(randomWord)) {
            System.out.println("You win");
        } else {
            System.out.println("You loss");
        }

    }
}
