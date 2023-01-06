package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        double sumCoins = 0;
        while (!command.equals("End")) {
            command = scanner.nextLine();
            if (command.equals("Start")) {
                break;
            }
            double coin = Double.parseDouble(command);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                sumCoins += coin;
            } else {
                System.out.println("Cannot accept " + coin);

            }
        }
        double price = 0;
        String input;
        boolean flag = false;
        while (true) {
            input = scanner.nextLine();
            switch (input.toLowerCase()) {
                case "nuts":
                    price = 2;
                    flag = true;
                    break;
                case "water":
                    price = 0.7;
                    flag = true;
                    break;
                case "crisps":
                    price = 1.5;
                    flag = true;
                    break;
                case "soda":
                    price = 0.8;
                    flag = true;
                    break;
                case "coke":
                    price = 1;
                    flag = true;
                    break;
            }
            if (input.equals("End")) {
                break;
            }
            if (sumCoins < price) {
                System.out.println("Sorry, not enough money");
            } else if (flag) {
                System.out.println("Purchased " + input);
                sumCoins -= price;
            } else {
                System.out.println("Invalid product");
            }

        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
