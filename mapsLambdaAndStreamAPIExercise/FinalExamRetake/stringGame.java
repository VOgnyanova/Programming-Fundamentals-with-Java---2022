package FinalExamRetake;

import java.util.Scanner;

public class stringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            if (command.equals("Change")) {
                String oldWord = commandLine[1];
                String replaceWord = commandLine[2];
                if (text.contains(oldWord)) {
                    text = text.replace(oldWord, replaceWord);
                }
                System.out.println(text);
            } else if (command.equals("Includes")) {
                String substring = commandLine[1];
                if (text.contains(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("End")) {
                String endWord = commandLine[1];
                int length = endWord.length();
                String textSubstring = text.substring(text.length() - length);
                if (textSubstring.equals(endWord)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("Uppercase")) {
                text = text.toUpperCase();
                System.out.println(text);
            } else if (command.equals("FindIndex")) {
                String symbol = commandLine[1];
                char currentSymbol = symbol.charAt(0);
                int index = -1;
                if (text.contains(symbol)) {
                    index = text.indexOf(currentSymbol);
                    System.out.println(index);
                }
            } else if (command.equals("Cut")) {
                int startIndex = Integer.parseInt(commandLine[1]);
                int count = Integer.parseInt((commandLine[2]));
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.delete(startIndex + count, sb.length());
                sb.delete(0, startIndex);
                text = sb.toString();

                System.out.println(text);
            }
            input = scanner.nextLine();
        }
    }
}