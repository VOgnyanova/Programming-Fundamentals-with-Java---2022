package methodsLab;

import java.util.Scanner;

public class multiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        getMultiplyOfEvenAndOdd(number);

    }

    public static void getMultiplyOfEvenAndOdd(int number) {
        int evenSum = 0;
        int oddSum = 0;
        int result = 0;


        while (number != 0) {
            int digit = number % 10;
            number = number / 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

        }
        result = Math.abs(evenSum * oddSum);
        System.out.println(result);


    }

}