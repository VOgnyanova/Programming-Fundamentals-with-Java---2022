package methodsLab;

import java.util.Scanner;

public class printingTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = Integer.parseInt(scanner.nextLine());
        printTriangle(numberInput);

    }

    public static void printTriangle(int numberInput) {
        for (int i = 1; i <= numberInput; i++) {
            printLine(1, i);

        }
        for (int i = numberInput - 1; i >= 1; i--) {
            printLine(1, i);

        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

    }
}
