package dataTypeAndVariablesExercise;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double biggestKeg = Double.MIN_VALUE;
        String maxKegModel = "";

        for (int keg = 1; keg <= n; keg++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;


            if (volume >= biggestKeg) {
                biggestKeg = volume;
                maxKegModel = model;


            }
        }
        System.out.println(maxKegModel);
    }
}
