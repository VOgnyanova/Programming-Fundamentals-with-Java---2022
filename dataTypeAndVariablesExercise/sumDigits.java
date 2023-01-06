package dataTypeAndVariablesExercise;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int digit = Integer.parseInt(scanner.nextLine());
        int sumOfDigit = 0;

        while (digit > 0) {
            sumOfDigit += digit % 10;
            digit = digit / 10;
        }


        System.out.println(sumOfDigit);
    }
}
