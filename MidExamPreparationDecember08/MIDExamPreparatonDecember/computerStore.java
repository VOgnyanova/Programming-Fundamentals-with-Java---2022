package MIDExamPreparatonDecember;

import java.util.Scanner;

public class computerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double totalMoney = 0;


        while (!command.equals("regular") && !command.equals("special")) {
            double priceParts = Double.parseDouble(command);
            if (priceParts < 0) {
                System.out.println("Invalid price!");

            } else {
                totalMoney += priceParts;
            }
            command = scanner.nextLine();

        }
        double taxes = totalMoney * 0.20;
        double money = totalMoney + taxes;
        if (command.equals("special")) {
            money = money *0.90;

        }
        if (totalMoney == 0) {
            System.out.println("Invalid order!");


        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalMoney);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.printf("-----------%n");
            System.out.printf("Total price: %.2f$", money);

        }
    }
}