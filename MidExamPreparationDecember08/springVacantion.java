package MidExamPreparationDecember08;

import java.util.Scanner;

public class springVacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int countPeople = Integer.parseInt(scanner.nextLine());
        double priceFuelPerKm = Double.parseDouble(scanner.nextLine());
        double foodExpenses = Double.parseDouble(scanner.nextLine());
        double roomPrice = Double.parseDouble(scanner.nextLine());
        double accommodation = countPeople * roomPrice;
        if (countPeople >= 10) {
            accommodation *= 0.75;
        }

        double totalPrice = days * ((countPeople * foodExpenses) + (accommodation));


        while (budget > totalPrice) {
            break;
        }

        for (int i = 1; i <= days; i++) {
            double distance = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0) {
                totalPrice = (totalPrice + (distance * priceFuelPerKm)) * 1.4;


            } else if (i % 5 == 0) {
                totalPrice = (totalPrice + (distance * priceFuelPerKm)) * 1.4;


            } else if (i % 7 == 0) {

                totalPrice = (totalPrice + (distance * priceFuelPerKm));
                totalPrice -= totalPrice / countPeople;

            } else {
                totalPrice = (totalPrice + (distance * priceFuelPerKm));
            }
        }
        if (budget >= totalPrice) {
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", budget - totalPrice);
        } else {

            System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", totalPrice - budget);

        }
    }
}