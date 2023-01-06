package dataTypeAndVariablesExercise;

import java.util.Scanner;

public class snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int snowballs = Integer.parseInt(scanner.nextLine());
        double biggerSnowball = Double.MIN_VALUE;


        for (int i = 1; i <= snowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuantity = Integer.parseInt(scanner.nextLine());

            float snowballValue = (float) Math.pow((1.0 * snowballSnow / snowballTime), snowballQuantity);

            if (snowballValue >= biggerSnowball) {
                biggerSnowball = snowballValue;


                System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballQuantity);
            }
        }
    }
}