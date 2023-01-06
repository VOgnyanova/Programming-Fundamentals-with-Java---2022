package methodsLab;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actions = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        switch (actions) {
            case "add":
                inputAdd(a, b);
                break;
            case "multiply":
                inputMultiply(a, b);
                break;
            case "subtract":
                inputSubtract(a, b);
                break;
            case "divide":
                inputDivide(a, b);
                break;
        }


    }

    public static void inputAdd(int a, int b) {
        System.out.println(a + b);

    }

    public static void inputMultiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void inputSubtract(int a, int b) {
        System.out.println(a - b);
    }

    public static void inputDivide(int a, int b) {
        System.out.println(a / b);
    }

}
