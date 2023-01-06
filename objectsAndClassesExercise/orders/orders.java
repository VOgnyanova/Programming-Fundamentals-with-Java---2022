package orders;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, Product> productMap = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String productName = command.split(" ")[0];
            Double price = Double.parseDouble(command.split(" ")[1]);
            Integer quantity = Integer.parseInt(command.split(" ")[2]);

            Product product = productMap.get(productName);
            if (product != null){

                }
            }


                command = scanner.nextLine();
        }
    }

