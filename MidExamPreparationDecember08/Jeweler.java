package MidExamPreparationDecember08;

import java.util.Arrays;
import java.util.Scanner;

public class Jeweler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []firstArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        int []secondArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

    }
}
