package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberArr.length; i++)
            for (int j = i + 1; j < numberArr.length; j++) {
                if (numberArr[i] + numberArr[j] == number) {
                    System.out.println(numberArr[i] + " " + numberArr[j]);
                }

            }

    }
}
