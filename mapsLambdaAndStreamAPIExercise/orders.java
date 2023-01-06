package mapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String product = command.split(" ")[0];
            double priceProduct = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);

            productPrice.put(product, priceProduct);

            if (!productQuantity.containsKey(product)) {
                productQuantity.put(product, quantity);
            } else {

                productQuantity.put(product, productQuantity.get(product) + quantity);
            }


            command = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrice.entrySet()) {
            String productName = entry.getKey();
            double finalPrice = entry.getValue() * productQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName,finalPrice);
        }
    }
}
