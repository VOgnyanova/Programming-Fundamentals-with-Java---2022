package methodsExercise;

import java.util.Scanner;

import static java.lang.System.*;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        printCharacters(symbol1, symbol2);
        printUpperCharacters(symbol1, symbol2);

    }

    private static void printCharacters(char s1, char s2) {

        for (int i = s1 + 1; i < s2; i++) {

            System.out.print((char) i + " ");
        }


    }

    private static void printUpperCharacters(char s1, char s2) {
        for (int i = s2 + 1; i < s1; i++) {
            System.out.print((char) i + " ");
        }
    }
}
