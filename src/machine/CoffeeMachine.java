package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int minimal (int a, int b, int c) {
        return (a <= b && a <= c) ? a : Math.min(b, c);
    }
    public static void fill(int mlOfWater, int mlOfMilk, int gramsOfCoffee, int disposableCups) {
        return;

    }
    public static void main(String[] args) {
        String output = """
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!""";
        //Scanner scanner = new Scanner(System.in);
/*        int numberOfCups = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need:", numberOfCups);
        System.out.printf("%n%d ml of water", numberOfCups * 200);
        System.out.printf("%n%d ml of milk", numberOfCups * 50);
        System.out.printf("%n%d g of coffee beans", numberOfCups * 15);*/
/*        System.out.println("Write how many ml of water the coffee machine has:");
        int mlOfWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int mlOfMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int gramsOfCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCups = scanner.nextInt();
        long mlOfwaterRound = Math.round((double)mlOfWater / (numberOfCups * 200));
        long mlOfMilkRound = Math.round((double)mlOfMilk / (numberOfCups * 50));
        long gramesOfCoffeeRound = Math.round((double)gramsOfCoffeeBeans / (numberOfCups * 15));
        if ((numberOfCups == 0 && (mlOfWater == 0 || mlOfMilk == 0 || gramsOfCoffeeBeans == 0)) ||
                minimal(mlOfWater / 200, mlOfMilk / 50, gramsOfCoffeeBeans / 15) - numberOfCups == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if ((numberOfCups == 0 && mlOfWater != 0 && mlOfMilk != 0 && gramsOfCoffeeBeans != 0)||
                minimal((int)mlOfwaterRound , (int)mlOfMilkRound, (int)gramesOfCoffeeRound) > 1) {
            int numberOfAdditionalCups = minimal(mlOfWater / 200 , mlOfMilk / 50 , gramsOfCoffeeBeans / 15) - numberOfCups;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", numberOfAdditionalCups);
        } else {
                int numberOfPossibleCups = minimal(mlOfWater / 200 , mlOfMilk / 50 , gramsOfCoffeeBeans / 15);
            System.out.printf("No, I can make only %d cup(s) of coffee", numberOfPossibleCups);
        }*/
        String status = """
                The coffee machine has:
                400 ml of water
                540 ml of milk
                120 g of coffee beans
                9 disposable cups
                $550 of money
                """;
        System.out.println(status);
        System.out.println("Write action (buy, fill, take): ");
            Scanner scanner = new Scanner(System.in);
            String option = scanner.next();
            if (option.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                int mlOfWater = scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                int mlOfMilk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                int gramsOfCoffeeBeans = scanner.nextInt();
                System.out.println("Write how many disposable cups you want to add:");
                int numberOfCups = scanner.nextInt();
                System.out.println();
                System.out.println("The coffee machine has:");
                System.out.printf("%d ml of water", mlOfWater + 400);
                System.out.printf("%n%d ml of milk", mlOfMilk + 540);
                System.out.printf("%n%d g of coffee beans", gramsOfCoffeeBeans + 120);
                System.out.printf("%n%d disposable cups", numberOfCups + 9);
                System.out.println();
                System.out.println("$550 of money");

            } else if (option.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    int optionNext = scanner.nextInt();
                    if (optionNext == 3) {
                        System.out.println();
                        int mlofWater = 400 - 200;
                        int mlOfMilk = 540 - 100;
                        int gramsOfCoffeeBeans = 120 - 12;
                        int numberOfCups = 9;
                        System.out.println("The coffee machine has:");
                        System.out.printf("%d ml of water", mlofWater);
                        System.out.printf("%n%d ml of milk", mlOfMilk);
                        System.out.printf("%n%d g of coffee beans", gramsOfCoffeeBeans);
                        System.out.printf("%n%d disposable cups", numberOfCups - 1);
                        System.out.printf("%n%d of money", 550 + 6);
                    } else if (optionNext == 2) {
                        System.out.println();
                        int mlofWater = 400 - 350;
                        int mlOfMilk = 540 - 75;
                        int gramsOfCoffeeBeans = 120 - 20;
                        int numberOfCups = 9;
                        System.out.println("The coffee machine has:");
                        System.out.printf("%d ml of water", mlofWater);
                        System.out.printf("%n%d ml of milk", mlOfMilk);
                        System.out.printf("%n%d g of coffee beans", gramsOfCoffeeBeans);
                        System.out.printf("%n%d disposable cups", numberOfCups - 1);
                        System.out.printf("%n%d of money", 550 + 7);
                    } else {
                        System.out.println();
                        int mlofWater = 400 - 250;
                        int gramsOfCoffeeBeans = 120 - 16;
                        int numberOfCups = 9;
                        System.out.println("The coffee machine has:");
                        System.out.printf("%d ml of water", mlofWater);
                        System.out.println();
                        System.out.println("540 ml of milk");
                        System.out.printf("%d g of coffee beans", gramsOfCoffeeBeans);
                        System.out.printf("%n%d disposable cups", numberOfCups - 1);
                        System.out.printf("%n%d of money", 550 + 4);
                    }
                } else if (option.equals("take")) {
                int money = 550;
                System.out.printf("I gave you $%d", money);
                System.out.println();
                String newStatus = """
                        
                        The coffee machine has:
                        400 ml of water
                        540 ml of milk
                        120 g of coffee beans
                        9 disposable cups""";
                System.out.println(newStatus);
                System.out.printf("$%d of money", 0);
            }
    }
}



