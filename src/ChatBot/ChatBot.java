package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // greetings
        System.out.println("Hello! My name is Stefan!");
        System.out.println("I was created in 2022!");

        // acquaintance
        System.out.println("Please? remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");

        // guess age
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders od dividing your age by 3, 5 adn 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age;
        age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is "+ age + "; that`s a good time to start programming!");

        // count
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for(int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }

        // test
        System.out.println("Let`s test your geography knowledge.");
        System.out.println("How many regions in Ukraine?");
        System.out.println("1. 10 regions.");
        System.out.println("2. 24 regions.");
        System.out.println("3. 55 regions.");
        System.out.println("4. I don`t know.");

        while (true){
            int answer = scanner.nextInt();
            if(answer == 2){
                System.out.println("Great you right!");
                break;
            }
            else{
                System.out.println("Please, try again.");
            }
        }

        System.out.println("Goodbye, have a nice day!");
    }
}
