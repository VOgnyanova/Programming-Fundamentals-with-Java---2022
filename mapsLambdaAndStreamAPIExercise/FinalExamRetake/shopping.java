package FinalExamRetake;

import java.util.*;
import java.util.stream.Collectors;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> stores = new LinkedHashMap<>();
        List<String> grocery = Arrays.stream(scanner.nextLine().split("->")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Go Shopping")) {
            String[] input = command.split("->");
            String inputLine = input[0];


        }
    }

}