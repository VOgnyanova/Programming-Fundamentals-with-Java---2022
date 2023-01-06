package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class evenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberArr[] = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numberArr.length; i++) {


            if (numberArr[i] % 2 == 0) {
                evenSum += numberArr[i];
            } else {
                oddSum += numberArr[i];
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
