package CoffeMachine;

import java.util.Scanner;

public class coffeMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Вода
        System.out.println("Write how many ml of water the coffee machine has: ");
        System.out.print("> ");
        int water = scanner.nextInt();
        //молоко
        System.out.println("Write how many ml of milk the coffee machine has: ");
        System.out.print("> ");
        int milk = scanner.nextInt();
        //зёрна
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        System.out.print("> ");
        int coffeeBeans = scanner.nextInt();
        //чашки
        System.out.println("Write how many cups of coffee you will need: ");
        System.out.print("> ");
        int cups = scanner.nextInt();
        //Сколько получится ингридиентов
        int difference1 = 0;
        int difference2 = 0;
        int realNumberWater = water/200;
        int realNumberMilk = milk/50;
        int realNumberCoffeeBeans = coffeeBeans/15;
        //варианты ответа
        if (water<200 || milk<50 || coffeeBeans<15){
            System.out.println("No, I can make only 0 cups of coffee");
        }
        else if(water==200 || milk==50 || coffeeBeans==15){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if(water>200 & milk>50 & coffeeBeans>15){
            //сравнение 2 показателей
            if(realNumberWater>cups & realNumberWater>cups & realNumberCoffeeBeans>cups) {
                if (realNumberMilk > realNumberWater) {
                    difference1 += realNumberWater;
                }
                else {
                    difference1 += realNumberMilk;
                }
                //сравнение 1 показателя с зернами
                if (difference1 > realNumberCoffeeBeans) {
                    difference2 += realNumberCoffeeBeans;
                } else {
                    difference2 += difference1;
                }
                difference2 -= cups;
                System.out.println("Yes, I can make that amount of coffee (and even " + difference2 + " more than that)");
            }
            else{
                //первая часть сравнения
                if(realNumberMilk>realNumberWater){
                    difference1 += realNumberWater;
                }
                else{
                    difference1 += realNumberMilk;
                }
                //вторая часть сровнения
                if (difference1>realNumberCoffeeBeans){
                    difference2 += realNumberCoffeeBeans;
                }
                else{
                    difference2 += difference1;
                }
                System.out.println("No, I can make only "+ difference2 +" cups of coffee");
            }
        }
    }
}
