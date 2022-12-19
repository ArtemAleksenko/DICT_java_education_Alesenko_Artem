package CoffeMachine;

import java.util.Scanner;

public class coffeMachine {
    private static final Scanner scanner = new Scanner(System.in);
    private int water, milk, beans, cups, money;

    public coffeMachine (int startedWater, int startedMilk, int startedCoffeeBeans, int startedCups, int startedMoney){
        this.water = startedWater;
        this.milk = startedMilk;
        this.beans = startedCoffeeBeans;
        this.cups = startedCups;
        this.money = startedMoney;
    }

    public  void mode (String answer) {
        switch (answer){
            case "buy" -> buy();
            case "fill" -> fill();
            case "take" -> take();
            case "remaining" -> remaining();
            case "exit" -> System.exit(0);
            default -> System.out.println("Incorrect operation");
        }
    }

    private void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to menu: ");
        String input = scanner.nextLine();
        switch (input){
            case "1" -> espresso();
            case "2" -> latte();
            case "3" -> cappuccino();
            case "back" -> System.out.println("Back to menu");
            default -> {
                System.out.println("Incorrect input");
                buy();
            }
        }
    }

    private void fill(){
        System.out.println("Write how many ml of water you want to add: ");
        System.out.print("> ");
        int newWater = scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        System.out.print("> ");
        int newMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        System.out.print("> ");
        int newCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable coffee cups you want to add:");
        System.out.print("> ");
        int newCups = scanner.nextInt();
        //добавление новых ресурсов
        water += newWater;
        milk += newMilk;
        beans += newCoffeeBeans;
        cups += newCups;
    }

    private void take(){
        System.out.println("I gave you " + money);
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        money = money * 0;
        System.out.println(money + " of money");
    }

    private void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
    }

    private void espresso(){
        if (water >= 250 & milk > 0 & beans >= 16 & cups >= 1){
            water -= 250;
            beans -= 16;
            cups -= 1;
            money += 4;
            System.out.println("I have enough resources, making you a coffee!");
        } else{
            System.out.println("Sorry, not enough resources, to make a coffee!");
        }
    }

    private void latte(){
        if(water >= 350 & milk >= 75 & beans >= 20 & cups >= 1) {
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups -= 1;
            money += 7;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            System.out.println("Sorry, not enough resources, to make a coffee!");
        }
    }

    private void cappuccino(){
        if (water >= 250 & milk > 0 & beans >= 16 & cups >= 1){
            water -= 250;
            beans -= 16;
            cups -= 1;
            money += 4;
            System.out.println("I have enough resources, making you a coffee!");
        } else{
            System.out.println("Sorry, not enough resources, to make a coffee!");
        }
        }
    }
