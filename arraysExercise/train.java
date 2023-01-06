package arraysExercise;


import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[numberOfWagons];
        int sum = 0;
        for (int i = 0; i < wagons.length; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            sum += countPeople;

            System.out.print(countPeople + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}

