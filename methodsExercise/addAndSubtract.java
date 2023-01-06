package methodsExercise;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        printAddAndSubtractNumbers(num1, num2, num3);
    }

    private static void printAddAndSubtractNumbers(int n1, int n2, int n3) {
        int sum = n1 + n2;
        int subtract = sum - n3;
        System.out.println(subtract);


    }
}
