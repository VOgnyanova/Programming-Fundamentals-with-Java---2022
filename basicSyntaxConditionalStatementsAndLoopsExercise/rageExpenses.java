package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int trashedHeadset = countLostGames / 2;
        int trashedMouse = countLostGames / 3;
        int trashedKeyboard = countLostGames / 6;
        int trashedDisplay = countLostGames / 12;

        double total = priceHeadset * trashedHeadset + priceMouse * trashedMouse + priceKeyboard * trashedKeyboard + trashedDisplay * priceDisplay;

        System.out.printf("Rage expenses: %.2f lv.", total);
    }

    public static class ages {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int age = Integer.parseInt(scanner.nextLine());
            if (age <= 2) {
                System.out.println("baby");
            } else if (age <= 13) {
                System.out.println("child");
            } else if (age <= 19) {
                System.out.println("teenager");
            } else if (age <= 65) {
                System.out.println("adult");
            } else if (age > 66) {
                System.out.println("elder");
            }
        }
    }
}
