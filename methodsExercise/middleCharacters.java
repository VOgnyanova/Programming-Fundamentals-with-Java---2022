package methodsExercise;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String text) {

        if (text.length() % 2 == 1) {
            int indexOfMiddle = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddle));

        } else {
            int indexFirstMiddle = text.length() / 2 - 1;
            int indexSecondMiddle = text.length() / 2;
            System.out.println(text.charAt(indexFirstMiddle) + "" + text.charAt(indexSecondMiddle));


        }
    }
}