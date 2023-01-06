package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double orderPrice = 0;

        for (int i = 1; i <= N; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int countDays = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());


            orderPrice = ((countDays * countCapsules) * pricePerCapsule);


            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);


            total += orderPrice;

        }
        System.out.printf("Total: $%.2f", total);

    }


}
