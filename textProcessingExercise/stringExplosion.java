package textProcessingExercise;

import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder text = new StringBuilder(input);
        int power = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == '>') {
                int attack = Integer.parseInt(text.charAt(i + 1) + "");
                power += attack;

            } else if (symbol != '>' && power > 0) {
                text.deleteCharAt(i);
                power--;
                i--;
            }

        }
        System.out.println(text);
    }
}
