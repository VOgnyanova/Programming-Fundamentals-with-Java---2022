package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbol = new LinkedHashMap<>();

        for (char symbolChar : text.toCharArray()) {
            if (symbolChar == ' ') {
                continue;
            }
            if (!symbol.containsKey(symbolChar)) {
                symbol.put(symbolChar, 1);
            } else {
                int counter = symbol.get(symbolChar);
                symbol.put(symbolChar, counter + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbol.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
