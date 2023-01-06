package methodsLab;

import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        switch (operator) {
            case "/":

                operatorDivide(firstNumber, secondNumber);
                break;
            case "*":
                operatorMultiply(firstNumber, secondNumber);
                break;
            case "+":
                operatorAdd(firstNumber, secondNumber);
                break;
            case "-":
                operatorSubtract(firstNumber, secondNumber);
                break;
        }
    }

    public static void operatorDivide(double firstNum, double secondNum) {

        System.out.printf("%.0f", firstNum / secondNum);

    }

    public static void operatorMultiply(double firstNum, double secondNum) {

        System.out.printf("%.0f", firstNum * secondNum);
    }

    public static void operatorAdd(double firstNum, double secondNum) {

        System.out.printf("%.0f", firstNum + secondNum);
    }

    public static void operatorSubtract(double firstNum, double secondNum) {


        System.out.printf("%.0f", firstNum - secondNum);

    }
}