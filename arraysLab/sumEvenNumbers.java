package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sumEvenNumber = 0;
        for (int i = 0; i < numberArr.length; i++) {
            int even = numberArr[i];
            if (even % 2 == 0) {
                sumEvenNumber += even;
            }

        }
        System.out.println(sumEvenNumber);
    }
}
