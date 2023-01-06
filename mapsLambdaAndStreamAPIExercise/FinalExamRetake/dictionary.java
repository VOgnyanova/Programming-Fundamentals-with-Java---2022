package FinalExamRetake;

import java.util.*;

public class dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        Map<String, List<String>> dictionary = new TreeMap<>();
        String[] input = text.split(" \\| ");

        for (int i = 0; i < input.length; i++) {

            String word = input[i].split(": ")[0];
            String definition = input[i].split(": ")[1];

            if (!dictionary.containsKey(word)) {
                dictionary.put(word, new ArrayList<>());
            }
            dictionary.get(word).add(definition);
        }
        String teachersWords = scanner.nextLine();
        String[] teachersArr = teachersWords.split(" \\| ");
        String endCommand = scanner.nextLine();

        if (endCommand.equals("Test")) {
            dictionary.entrySet().forEach((e) -> {
                if (teachersWords.contains(e.getKey())) {
                    System.out.printf("%s:%n", e.getKey());
                    e.getValue().forEach(el -> System.out.printf(" -%s%n", el));

                }
            });
        } else if (endCommand.equals("Hand Over")) {
            dictionary.keySet().forEach(e -> System.out.printf("%s ", e));
        }
    }
}