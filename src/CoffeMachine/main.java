package CoffeMachine;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean work = true;
        coffeMachine coffee_machine = new coffeMachine(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        while (work){
            String answer = scanner.nextLine();
            coffee_machine.mode(answer);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
        }
        }
    }
