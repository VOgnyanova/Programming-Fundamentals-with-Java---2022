package listExerxcise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> texts = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.contains("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > texts.size() - 1) {
                    endIndex = texts.size() - 1;
                }
                boolean isValidIndexes = startIndex <= texts.size() - 1 && endIndex >= 0;

                if (isValidIndexes) {
                    String result = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String currentText = texts.get(i);
                        result += currentText;

                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        texts.remove(startIndex);
                    }
                    texts.add(startIndex, result);
                }
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                String elementForDivide = texts.get(index);
                texts.remove(index);


                int partSize = elementForDivide.length() / parts;

                int beginIndex = 0;
                for (int part = 1; part < parts; part++) {
                    texts.add(index, elementForDivide.substring(beginIndex, beginIndex + partSize));
                    index++;
                    beginIndex += partSize;

                }

                texts.add(index, elementForDivide.substring(beginIndex, elementForDivide.length()));
            }


            command = scanner.nextLine();

        }
        for (String text : texts) {
            System.out.print(text + " ");
        }

    }
}
