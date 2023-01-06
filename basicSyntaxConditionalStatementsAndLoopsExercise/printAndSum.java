package basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class printAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int ednNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = startNumber; i <= ednNumber; i++) {
            sum = sum + i;

            System.out.printf("%d ", i);

        }
        System.out.println();
        System.out.printf("Sum: %d%n", sum);
    }


}
