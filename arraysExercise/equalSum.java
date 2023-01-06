package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class equalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numberArray.length - 1; index++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numberArray[leftIndex];

            }
            for (int rightIndex = index + 1; rightIndex <= numberArray.length - 1; rightIndex++) {
                rightSum += numberArray[rightIndex];

            }
            if (leftSum == rightSum) {
                System.out.println(index);
                return;
            }

        }
        System.out.println("no");


    }
}