package arraysExercise;

import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];


        for (int i = 1; i <= n; i++) {

            String num = scanner.nextLine();
            int firstNum = Integer.parseInt(num.split(" ")[0]);
            int secondNum = Integer.parseInt(num.split(" ")[1]);

            if (i % 2 == 0) {
                firstArr[i - 1] = secondNum;
                secondArr[i - 1] = firstNum;

            } else {
                firstArr[i - 1] = firstNum;
                secondArr[i - 1] = secondNum;
            }
        }
        for (int number : firstArr) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArr) {
            System.out.print(number + " ");

        }

    }

}


