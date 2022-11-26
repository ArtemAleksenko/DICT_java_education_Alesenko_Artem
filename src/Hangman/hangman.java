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
        // слово делится на символы и засувуется в масив 1
        String[] w = new String[]{};
        String randomWord = words.get(random.nextInt(words.size()));
        w = randomWord.split("");
        System.out.println(Arrays.toString(w));

        int times = 8;
        // тут мы делаем пустой масив длинной с масив 1 и заполняем его прочерками
        String[] unshown = new String[w.length];
        for(int i = 0; i < unshown.length; i++){
            unshown[i] = "-";
        }
        while (times > 0){
            AtomicBoolean check = new AtomicBoolean(false);
            boolean checkEnter = false;
            System.out.println(Arrays.toString(unshown));
            String leter;
            System.out.print("Input a letter: > ");
            leter = scanner.nextLine();
//            System.out.println(randomWord.indexOf(later));

            if(randomWord.contains(leter)) {
                for (int i = 0; i < randomWord.length(); i++){
                    if (randomWord.charAt(i) == leter.charAt(0) && unshown[i].equals("-")) {
                        unshown[i] = leter;
                        checkEnter = true;
                    }
                }
                if (!checkEnter){
                    times--;
                }
                Arrays.stream(unshown).forEach(item -> {
                    if(item.equals("-")) check.set(true);
                });
                if(!check.get()){
                    break;
                }
            }
            else{
                System.out.println("That letter doesn`t appear in the word");
                times --;
            }

        }
        System.out.println("Thanks for playing!\n" +
                "We`ll see how well you did in the next stage");

    }
}
