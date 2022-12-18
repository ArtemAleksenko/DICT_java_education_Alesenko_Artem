package CoffeMachine;

import java.util.Scanner;

public class coffeMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // стартовый инвентарь
        int startedMoney = 550;
        int startedWater = 400;
        int startedMilk = 540;
        int startedCoffeBeans = 120;
        int startedCups = 9;
        boolean work = true;

        while (work) {
            // выбор режима
            System.out.println("Write action(buy, fill, take, remaining, exit):");
            System.out.print("> ");
            String mode = scanner.next();
            switch (mode) {
                case "buy": {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back – to main menu: ");
                    System.out.print("> ");
                    String nameCoffee = scanner.next();
                    switch (nameCoffee) {
                        case "1": {
                            if (startedWater >= 250 & startedMilk > 0 & startedCoffeBeans >= 16 & startedCups >= 1){
                                startedWater -= 250;
                                startedCoffeBeans -= 16;
                                startedCups -= 1;
                                startedMoney += 4;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }
                            else{
                                System.out.println("Sorry, not enough resources, to make a coffee!");
                                break;
                            }
                        }
                        case "2": {
                            if(startedWater >= 350 & startedMilk >= 75 & startedCoffeBeans >= 20 & startedCups >= 1) {
                                startedWater -= 350;
                                startedMilk -= 75;
                                startedCoffeBeans -= 20;
                                startedCups -= 1;
                                startedMoney += 7;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }
                            else {
                                System.out.println("Sorry, not enough resources, to make a coffee!");
                                break;
                            }
                        }
                        case "3": {
                            if(startedWater >= 350 & startedMilk >= 75 & startedCoffeBeans >= 20 & startedCups >= 1) {
                                startedWater -= 200;
                                startedMilk -= 100;
                                startedCoffeBeans -= 12;
                                startedCups -= 1;
                                startedMoney += 6;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }
                            else {
                                System.out.println("Sorry, not enough resources, to make a coffee!");
                                break;
                            }
                        }
                        case "back":{
                            break;
                        }
                        default: {
                            System.out.println("Incorrect input");
                            break;
                        }
                    }
                    break;
                }
                case "fill": {
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
                    startedWater += newWater;
                    startedMilk += newMilk;
                    startedCoffeBeans += newCoffeeBeans;
                    startedCups += newCups;
                    //вывод данных
                    System.out.println("The coffee machine has: ");
                    System.out.println(startedWater + " of water");
                    System.out.println(startedMilk + " of milk");
                    System.out.println(startedCoffeBeans + " of coffee beans");
                    System.out.println(startedCups + " of disposable cups");
                    System.out.println(startedMoney + " of money");
                    break;
                }
                case "take": {
                    System.out.println("I gave you " + startedMoney);
                    System.out.println();
                    System.out.println("The coffee machine has:");
                    System.out.println(startedWater + " of water");
                    System.out.println(startedMilk + " of milk");
                    System.out.println(startedCoffeBeans + " of coffee beans");
                    System.out.println(startedCups + " of disposable cups");
                    startedMoney = startedMoney * 0;
                    System.out.println(startedMoney + " of money");
                    break;
                }
                case "remaining": {
                    // вывод инвентаря кофе машины
                    System.out.println("The coffee machine has:");
                    System.out.println(startedWater + " of water");
                    System.out.println(startedMilk + " of milk");
                    System.out.println(startedCoffeBeans + " of coffee beans");
                    System.out.println(startedCups + " of disposable cups");
                    System.out.println(startedMoney + " of money");
                    System.out.println();
                    break;
                }
                case "exit":{
                    work = false;
                    break;
                }
                default: {
                    System.out.println("Incorrect input");
                    break;
                }
            }
        }
    }
}
