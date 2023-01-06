package MidExamPreparationDecember08;

import java.util.Scanner;

public class burgerBus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCity = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;
        double losses = 0;
        int counter = 0;
        double profit = 0;

        for (int i = 0; i < countCity; i++) {
            counter++;
            String nameCity = scanner.nextLine();
            double ownersIncome = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            totalMoney = ownersIncome - expenses;


            if (counter % 3 == 0) {
                losses = expenses * 0.50;
                totalMoney -= losses;

            }
            if (counter % 5 == 0) {
                losses = ownersIncome * 0.10;
                totalMoney -= losses;

            }
            profit += totalMoney;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", nameCity, totalMoney);
        }
            System.out.printf("Burger Bus total profit: %.2f leva.", profit);

        }


    }
