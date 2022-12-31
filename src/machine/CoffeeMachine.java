package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int minimal (int a, int b, int c) {
        return (a < b && a < c) ? a : (b < c && b < a) ? b : c;
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
//        System.out.println("Write how many cups of coffee you will need: ");
        Scanner scanner = new Scanner(System.in);
/*        int numberOfCups = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need:", numberOfCups);
        System.out.printf("%n%d ml of water", numberOfCups * 200);
        System.out.printf("%n%d ml of milk", numberOfCups * 50);
        System.out.printf("%n%d g of coffee beans", numberOfCups * 15);*/
        System.out.println("Write how many ml of water the coffee machine has:");
        int mlOfWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int mlOfMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int gramsOfCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int numberOfCups = scanner.nextInt();
        int sum = (numberOfCups * 200) +
                (numberOfCups * 50) + (numberOfCups * 15);
        if ((mlOfWater + mlOfMilk + gramsOfCoffeeBeans ) == sum) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if ((Math.round((double)mlOfWater / (numberOfCups * 200)) == 1 &&
                Math.round((double)mlOfMilk / (numberOfCups * 50)) > 1 &&
                Math.round((double)gramsOfCoffeeBeans / (numberOfCups * 15)) > 1)||
                (Math.round((double)mlOfWater / (numberOfCups * 200)) > 1 &&
                        Math.round((double)mlOfMilk / (numberOfCups * 50)) == 1 &&
                        Math.round((double)gramsOfCoffeeBeans / (numberOfCups * 15)) > 1) ||
                (Math.round((double)mlOfWater / (numberOfCups * 200)) > 1 &&
                        Math.round((double)mlOfMilk / (numberOfCups * 50)) > 1 &&
                        Math.round((double)gramsOfCoffeeBeans / (numberOfCups * 15)) == 1)) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if ((mlOfWater + mlOfMilk + gramsOfCoffeeBeans ) > sum || (Math.round((double)mlOfWater / (numberOfCups * 200)) > 1 &&
                Math.round((double)mlOfMilk / (numberOfCups * 50)) > 1 &&
                Math.round((double)gramsOfCoffeeBeans / (numberOfCups * 15)) > 1)) {
            int numberOfAdditionalCups = (mlOfWater + mlOfMilk + gramsOfCoffeeBeans ) / sum;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", numberOfAdditionalCups);
        } else if (numberOfCups !=0 && (Math.round((double)mlOfWater / (numberOfCups * 200)) < 1 ||
                Math.round((double)mlOfMilk / (numberOfCups * 50)) < 1 ||
                Math.round((double)gramsOfCoffeeBeans / (numberOfCups * 15)) < 1)) {
                int numberOfPossibleCups = minimal(mlOfWater / 200 , mlOfMilk / 50 , gramsOfCoffeeBeans / 15);
            System.out.printf("No, I can make only %d cup(s) of coffee", numberOfPossibleCups);

        }

    }
}
