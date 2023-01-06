package methodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());


        long fact1 = printFact1(number1);
        long fact2 = printFact2(number2);
        double result = fact1 * 1.0 / fact2;
        System.out.printf("%.2f", result);
    }

    private static long printFact1(double num1) {

        long fact1 = 1;
        for (int i = 1; i <= num1; i++) {
            fact1 = fact1 * i;

        }
        return fact1;

    }

    private static long printFact2(double num2) {
        long fact2 = 1;
        for (int i = 1; i <= num2; i++) {
            fact2 = fact2 * i;
        }
        return fact2;
    }
}
