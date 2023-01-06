package methodsLab;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());


        switch (product) {
            case "coffee":

                inputCoffee(quantity);
                break;
            case "water":

                inputWater(quantity);
                break;
            case "coke":
                inputCoke(quantity);
                break;
            case "snacks":

                inputSnack(quantity);
                break;
        }
    }

    public static void inputCoffee(int quantity) {

        System.out.printf("%.2f", 1.50 * quantity);


    }

    public static void inputWater(int quantity) {
        System.out.printf("%.2f", 1.00 * quantity);
    }

    public static void inputCoke(int quantity) {

        System.out.printf("%.2f", 1.40 * quantity);
    }

    public static void inputSnack(int quantity) {

        System.out.printf("%.2f", 2.00 * quantity);
    }
}