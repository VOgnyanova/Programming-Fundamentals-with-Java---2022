package MidExamPreparationDecember08;

import java.util.Scanner;

public class BBSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double profit = 0.0;

        for (int i = 0; i < number; i++) {

            double currentProfit = 0.0;


            String name = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if ((i + 1) % 3 == 0) {

                expenses = expenses + (expenses * 0.5);
            }

            if ((i + 1) % 5 == 0) {

                income = income - (income * 0.1);
            }
            currentProfit = income - expenses;

            profit = profit + currentProfit;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", name, currentProfit);
        }

        System.out.printf("Burger Bus total profit: %.2f leva.%n", profit);


    }
}
