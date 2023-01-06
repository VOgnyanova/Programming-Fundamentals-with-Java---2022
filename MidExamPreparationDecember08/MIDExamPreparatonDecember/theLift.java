package MIDExamPreparatonDecember;

import java.util.Arrays;
import java.util.Scanner;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] wagonsArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < wagonsArray.length; i++) {

            sum += wagonsArray[i];

        }
    }
}
