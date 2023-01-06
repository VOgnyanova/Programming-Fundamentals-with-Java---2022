package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] maxSequence = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = 0;
        int length = 1;
        int startLength = 0;
        int bestInt = 0;

        for (int i = 1; i <= maxSequence.length - 1; i++) {

            if (maxSequence[i] == maxSequence[i - 1]) {
                length++;
            } else {
                length = 1;
                startLength = i;
            }
            if (length > maxLength) {
                maxLength = length;
                bestInt = startLength;
            }
        }

        for (int j = bestInt; j < bestInt + maxLength; j++) {
            System.out.print(maxSequence[j] + " ");

        }

    }

}
