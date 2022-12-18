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
        // вывод инвентаря кофе машины
        System.out.println("The coffee machine has:");
        System.out.println(startedWater + " of water");
        System.out.println(startedMilk + " of milk");
        System.out.println(startedCoffeBeans + " of coffee beans");
        System.out.println(startedCups + " of disposable cups");
        System.out.println(startedMoney + " of money");
        System.out.println();
        // выбор режима
        System.out.println("Write action(buy, fill, take):");
        System.out.print("> ");
        String mode = scanner.nextLine();
        switch (mode){
            case "buy":{
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int nameCoffee = scanner.nextInt();
                System.out.println("The coffee machine has:");
                switch (nameCoffee){
                    case 1:{
                        int becamWater = startedWater - 250;
                        int becamCoffeeBeans = startedCoffeBeans - 16;
                        int becamCups = startedCups - 1;
                        int becamMoney = startedMoney + 4;
                        System.out.println(becamWater + " of water");
                        System.out.println(startedMilk + " of milk");
                        System.out.println(becamCoffeeBeans + " of coffee beans");
                        System.out.println(becamCups + " of disposable cups");
                        System.out.println(becamMoney + " of money");
                        break;
                    }
                    case 2:{
                        int becamWater = startedWater - 350;
                        int becamMilk = startedMilk - 75;
                        int becamCoffeeBeans = startedCoffeBeans - 20;
                        int becamCups = startedCups - 1;
                        int becamMoney = startedMoney + 7;
                        System.out.println(becamWater + " of water");
                        System.out.println(becamMilk + " of milk");
                        System.out.println(becamCoffeeBeans + " of coffee beans");
                        System.out.println(becamCups + " of disposable cups");
                        System.out.println(becamMoney + " of money");
                        break;
                    }
                    case 3:{
                        int becamWater = startedWater - 200;
                        int becamMilk = startedMilk - 100;
                        int becamCoffeeBeans = startedCoffeBeans - 12;
                        int becamCups = startedCups - 1;
                        int becamMoney = startedMoney + 6;
                        System.out.println(becamWater + " of water");
                        System.out.println(becamMilk + " of milk");
                        System.out.println(becamCoffeeBeans + " of coffee beans");
                        System.out.println(becamCups + " of disposable cups");
                        System.out.println(becamMoney + " of money");
                        break;
                    }
                    default:{
                        System.out.println("Incorrect input");
                        break;
                    }
                }
                break;
            }
            case "fill":{
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
                newWater += startedWater;
                newMilk += startedMilk;
                newCoffeeBeans += startedCoffeBeans;
                newCups += startedCups;
                //вывод данных
                System.out.println("The coffee machine has: ");
                System.out.println(newWater + " of water");
                System.out.println(newMilk + " of milk");
                System.out.println(newCoffeeBeans + " of coffee beans");
                System.out.println(newCups + " of disposable cups");
                System.out.println(startedMoney + " of money");
                break;
            }
            case "take":{
                System.out.println("I gave you "+ startedMoney);
                System.out.println();
                System.out.println("The coffee machine has:");
                System.out.println(startedWater + " of water");
                System.out.println(startedMilk + " of milk");
                System.out.println(startedCoffeBeans + " of coffee beans");
                System.out.println(startedCups + " of disposable cups");
                System.out.println(0 + " of money");
                break;
            }
            default:{
                System.out.println("Incorrect input");
                break;
            }
        }
    }
}
