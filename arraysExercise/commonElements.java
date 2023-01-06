package arraysExercise;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String firstLetters = scanner.nextLine();
        String secondLetters = scanner.nextLine();

        String[] array1 = firstLetters.split(" ");
        String[] array2 = secondLetters.split(" ");
        for (String element2 : array2) {
            for (String element1 : array1) {
                if (element2.equals(element1)) {
                    System.out.print(element2 + " ");
                }
            }


        }
    }
}
