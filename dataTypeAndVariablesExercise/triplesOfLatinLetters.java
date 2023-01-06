package dataTypeAndVariablesExercise;

import java.util.Scanner;

public class triplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                for (int k = 0; k <= n - 1; k++) {


                    char firstLetter = (char) ('a' + i);
                    char secondLetter = (char) ('a' + j);
                    char thirdLetter = (char) ('a' + k);

                    System.out.printf("%c%c%c%n", firstLetter, secondLetter, thirdLetter);

                }
            }

        }
    }
}
