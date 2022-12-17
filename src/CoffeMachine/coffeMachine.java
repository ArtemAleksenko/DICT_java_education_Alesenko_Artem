package CoffeMachine;

import java.util.Scanner;

public class coffeMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();
        System.out.println("For " + cups + " cups of coffee you will need");
        int water = cups * 200;
        System.out.println(water + " ml of water");
        int milk = cups * 50;
        System.out.println(milk + " ml of milk");
        int coffeBeans = cups * 15;
        System.out.println(coffeBeans + " g of coffee beans");
    }
}
