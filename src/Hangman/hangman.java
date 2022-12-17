package Hangman;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class hangman {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("HANGMAN");

        // список слов
        var words = new ArrayList<String>();
        words.add("java");
        words.add("python");
        words.add("javascript");
        words.add("kotlin");
        words.trimToSize();

        boolean work = true;

        while (work) {
            System.out.print("Type 'play'; to play the game, 'exit' to quit: ");
            String mode = scanner.nextLine();
            switch (mode) {
                case "play": {
                    // слово делится на символы и засувуется в масив 1
                    String[] w = new String[]{};
                    String randomWord = words.get(random.nextInt(words.size()));
                    w = randomWord.split("");
//        System.out.println(Arrays.toString(w));

                    int times = 8;
                    // тут мы делаем пустой масив длинной с масив 1 и заполняем его прочерками
                    String[] unshown = new String[w.length];
                    for (int i = 0; i < unshown.length; i++) {
                        unshown[i] = "-";
                    }
                    ArrayList<String> secondMistace = new ArrayList<>();
                    ArrayList<String> dontUsedLeter = new ArrayList<>();


                    while (times > 0) {
                        AtomicBoolean check = new AtomicBoolean(false);
                        boolean checkEnter = false;
                        boolean notCorrectAnsw = false;
                        boolean highLeter = false;
                        System.out.println(Arrays.toString(unshown));
                        String leter;
                        System.out.print("Input a letter: > ");
                        leter = scanner.nextLine();
//            System.out.println(randomWord.indexOf(later));
                        if (leter.length() > 1) {
                            System.out.println("You should input a single letter.");
                        } else {
                            if (randomWord.contains(leter)) {
                                for (int i = 0; i < randomWord.length(); i++) {
                                    if (randomWord.charAt(i) == leter.charAt(0) && unshown[i].equals("-")) {
                                        unshown[i] = leter;
                                        checkEnter = true;
                                    }
                                }

                                if (!checkEnter) {
                                    System.out.println("You`ve already guessed this letter.");
                                    if (!secondMistace.contains(leter)) {
                                        secondMistace.add(leter);
                                    }
                                }

                                Arrays.stream(unshown).forEach(item -> {
                                    if (item.equals("-")) check.set(true);
                                });
                                if (!check.get()) {
                                    System.out.println(Arrays.toString(unshown));
                                    System.out.println("You guessed the word!\n" +
                                            "You survived!");
                                    break;
                                }
                            } else if (!dontUsedLeter.contains(leter)) {
                                if (randomWord.contains(leter.toLowerCase())) {
                                    System.out.println("Please enter a lowercase English letter.");
                                } else {
                                    dontUsedLeter.add(leter);
                                    System.out.println("Not true letter");
                                }
                            } else if (dontUsedLeter.contains(leter)) {
                                System.out.println("You`ve already used this letter.");
                            }
                        }
                    }
                    if (times == 0) {
                        System.out.println(Arrays.toString(unshown));
                        System.out.println("You loss!");
                    }
                    break;
                }
                case "exit":
                {
                    work = false;
                    break;
                }
                default:
                    System.out.println("Incorrect input");
            }

        }
    }
}