package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberArr[] = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numberArr.length - 1; i++) {
            for (int j = 0; j < numberArr.length - 1; j++) {
                numberArr[j] = numberArr[j] + numberArr[j + 1];
            }
        }
        System.out.println(numberArr[0]);
    }
}
