package dataTypeAndVariablesExercise;

import java.util.Scanner;

public class sumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            char letters = scanner.nextLine().charAt(0);
            totalSum += letters;

        }
        System.out.printf("The sum equals: %d", totalSum);


    }

}
