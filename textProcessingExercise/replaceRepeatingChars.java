package textProcessingExercise;

import java.util.Scanner;

public class replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String rest = "";

        char firstSymbol = input.charAt(0);
        rest += firstSymbol;

        for (int i = 1; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (firstSymbol != currentSymbol) {
                rest += currentSymbol;

                firstSymbol = currentSymbol;
            }
        }
        System.out.println(rest);
    }
}
