package listsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < numbersList.size() - 1; i++) {
            if (numbersList.get(i).equals(numbersList.get(i + 1))) {
                numbersList.set(i, numbersList.get(i) + numbersList.get(i + 1));
                numbersList.remove(i + 1);
                i = -1;

            }
        }
        String output = joinElementByDelimiter(numbersList, " ");
        System.out.println(output);
    }


    public static String joinElementByDelimiter(List<Double> items,
                                                String delimiter) {
        String output = "";
        for (Double item : items) {
            output += (new DecimalFormat("0.#").format(item) + delimiter);

        }

        return output;
    }
}