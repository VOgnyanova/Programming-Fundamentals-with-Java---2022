package FinalExamRetake;

import java.util.Scanner;

public class stringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder textBuilder = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] input = command.split("\\s+");
            String inputLine = input[0];

            switch (inputLine) {
                case "Translate":
                    String word = input[1];
                    String newWord = input[2];
                    if (textBuilder.toString().contains(word)) {
                        String newSb = textBuilder.toString().replaceAll(word, newWord);
                        textBuilder.delete(0, textBuilder.length());
                        textBuilder.append(newSb);
                    }
                    System.out.println(textBuilder);
                    break;
                case "Includes":
                    String substring = input[1];
                    if (textBuilder.toString().contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String startWord = input[1];
                    if (textBuilder.indexOf(startWord) == 0) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    String newSb2 = textBuilder.toString().toLowerCase();
                    textBuilder.delete(0, textBuilder.length());
                    textBuilder.append(newSb2);
                    System.out.println(textBuilder);
                    break;
                case "FindIndex":
                    String ch = input[1];
                    if (textBuilder.toString().contains(ch)) {
                        int index = textBuilder.lastIndexOf(ch);
                        System.out.println(index);
                    }
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(input[1]);
                    int length = Integer.parseInt(input[2]);
                    if (startIndex >= 0 && startIndex < textBuilder.length() && startIndex < length && length < textBuilder.length()) {
                        textBuilder.delete(startIndex, startIndex + length);
                        System.out.println(textBuilder);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
