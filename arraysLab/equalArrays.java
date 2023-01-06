package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstArr[] = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int secondArr[] = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum1 = 0;
        int sum2 = 0;
        boolean areIdentical = false;

        for (int i = 0; i < firstArr.length; i++) {
            sum1 += firstArr[i];


            for (int j = 0; j < secondArr.length; j++) {
                sum2 += secondArr[j];
            }
            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = true;
                break;
            }
        }
        if (!areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum1);
        }

    }
}
