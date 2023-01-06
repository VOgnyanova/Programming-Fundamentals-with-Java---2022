package MapsLambdaAndStreamAPILab;

import java.util.*;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> countNumbersMap = new TreeMap<>();
        for (double currentNum : numbers) {
            Integer currentValue = countNumbersMap.get(currentNum);
            if (countNumbersMap.containsKey(currentNum)) {
                countNumbersMap.put(currentNum, currentValue + 1);
            } else {
                countNumbersMap.put(currentNum, 1);
            }

        }
        for (Map.Entry<Double, Integer> entry : countNumbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }


}
