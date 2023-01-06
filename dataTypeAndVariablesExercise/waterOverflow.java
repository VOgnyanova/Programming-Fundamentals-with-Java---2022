package dataTypeAndVariablesExercise;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sumOfLiters = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            if (sumOfLiters + liters <= capacity) {
                sumOfLiters += liters;


            } else {

                System.out.println("Insufficient capacity!");
            }

        }
        System.out.println(sumOfLiters);

    }
}