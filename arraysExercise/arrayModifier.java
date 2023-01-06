package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandTools = command.split(" ");
            String commandType = commandTools[0];

            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandTools[1]);
                    int index2 = Integer.parseInt(commandTools[2]);
                    int element1 = numbersArray[index1];
                    int element2 = numbersArray[index2];
                    numbersArray[index2] = element1;
                    numbersArray[index1] = element2;
                    break;
                case "multiply":
                    int indexMultiply1 = Integer.parseInt(commandTools[1]);
                    int elementMultiply1 = numbersArray[indexMultiply1];
                    int indexMultiply2 = Integer.parseInt(commandTools[2]);
                    int elementMultiply2 = numbersArray[indexMultiply2];
                    int product = elementMultiply1 * elementMultiply2;
                    numbersArray[indexMultiply1] = product;
                    break;
                case "decrease":
                    for (int i = 0; i < numbersArray.length; i++) {
                        numbersArray[i] -= 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbersArray.length; i++) {

            if (i != numbersArray.length - 1) {
                System.out.print(numbersArray[i] + ", ");
            } else {
                System.out.println(numbersArray[i]);

            }
        }
    }
}