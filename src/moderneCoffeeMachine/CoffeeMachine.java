package moderneCoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
        public static void Methode(String input) {
            //[ToDo] Refactoring the Code in this Method, use more classes, make code more readable for developpers

        }
    public static int minimal (int a, int b, int c) {
        return (a <= b && a <= c) ? a : Math.min(b, c);
    }
    public static void remaining (int mlOfWater, int mlOfMilk, int gramsOfCoffee, int disposableCups, int money) {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water", mlOfWater);
        System.out.printf("%n%d ml of milk", mlOfMilk);
        System.out.printf("%n%d g of coffee beans", gramsOfCoffee);
        System.out.printf("%n%d disposable cups", disposableCups);
        System.out.printf("%n$%d of money", money);
        System.out.println();
    }
    public static void take (int money) {
        System.out.printf("I gave you $%d", money);
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        int mlofWaterOld = 400;
        int mlOfMilkOld = 540;
        int gramsOfCoffeeBeansOld = 120;
        int numberOfCupsOld = 9;
        int moneyOld = 550;
        int[] listNew = new int[] {mlofWaterOld, mlOfMilkOld, gramsOfCoffeeBeansOld, numberOfCupsOld, moneyOld};
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String option = scanner.next();
            Methode(option);
            if (option.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int mlOfWater = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int mlOfMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int gramsOfCoffeeBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups you want to add:");
                int numberOfCups = scanner.nextInt();
                listNew[0] += mlOfWater;
                listNew[1] += mlOfMilk;
                listNew[2] += gramsOfCoffeeBeans;
                listNew[3] += numberOfCups;
                System.out.println("Write action (buy, fill, take, remaining, exit):");

            } else if (option.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String optionNext = scanner.next();
                if(optionNext.equals("back")) {
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                    continue;
                }
                if (Integer.parseInt(optionNext) == 3) {
                    if (minimal(listNew[0] / 200, listNew[1] / 50, listNew[2] / 15) >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        listNew[0] -= 200;
                        listNew[1] -= 100;
                        listNew[2] -= 12;
                        listNew[3] -= 1;
                        listNew[4] += 6;
                    } else {
                        if (listNew[0] < 200) {
                            System.out.println("Sorry, not enough water!");
                        } else if (listNew[1] < 100) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (listNew[2] < 12){
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    }
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                } else if (Integer.parseInt(optionNext) == 2) {
                    if (minimal(listNew[0] / 350, listNew[1] / 75, listNew[2] / 20) >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        listNew[0] -= 350;
                        listNew[1] -= 75;
                        listNew[2] -= 20;
                        listNew[3] -= 1;
                        listNew[4] += 7;
                    } else {
                        if (listNew[0] < 350) {
                            System.out.println("Sorry, not enough water!");
                        } else if (listNew[1] < 75) {
                            System.out.println("Sorry, not enough milk!");
                        } else if (listNew[2] < 20){
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    }
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                } else if (Integer.parseInt(optionNext) == 1){
                    if (Math.min(listNew[0] / 250, listNew[2] / 16) >= 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        listNew[0] -= 250;
                        listNew[2] -= 16;
                        listNew[3] -= 1;
                        listNew[4] += 4;
                    } else {
                        if (listNew[0] < 250) {
                            System.out.println("Sorry, not enough water!");
                        } else if (listNew[2] < 16){
                            System.out.println("Sorry, not enough coffee beans!");
                        }
                    }
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                }
            } else if (option.equals("take")) {
                take(listNew[4]);
                listNew[4] -= listNew[4];
                System.out.println("Write action (buy, fill, take, remaining, exit):");
            } else if (option.equals("remaining")) {
                remaining(listNew[0], listNew[1], listNew[2], listNew[3], listNew[4]);
                System.out.println("Write action (buy, fill, take, remaining, exit):");
            } else {
                return;
            }
        }

    }
}




