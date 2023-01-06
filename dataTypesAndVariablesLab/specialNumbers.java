package dataTypesAndVariablesLab;

import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int num = 1; num <= n; num++) {
            int sum = 0;
            int digits = num;
            while (digits > 0) {
                sum += digits % 10;
                digits = digits / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }
        }


    }


}
