package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numberArray.length; index++) {

            boolean isTop = true;
            for (int j = index + 1; j < numberArray.length; j++)
                if (numberArray[index] <= numberArray[j]) {
                    isTop = false;
                    break;
                }
            if (isTop) {
                System.out.print(numberArray[index] + " ");
            }

        }


    }

}
