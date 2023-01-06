package listExerxcise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class appendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> listByPipe = Arrays.stream(input.split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(listByPipe);


        System.out.println(listByPipe.toString()
                .replace("[","")
                .replace("]","")
                .trim()
                .replaceAll(",","")
                .replaceAll("\\s+"," "));
    }


}
