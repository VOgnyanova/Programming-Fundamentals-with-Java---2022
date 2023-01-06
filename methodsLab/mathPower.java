package methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberInput = Double.parseDouble(scanner.nextLine());
        double powerInput = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(powerNum(numberInput, powerInput)));
    }

    public static double powerNum(double number, double power) {
        double result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number;


        }
        return result;
    }
}
