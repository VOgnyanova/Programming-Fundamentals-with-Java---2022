package listExerxcise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            List<String> input = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name = input.get(0);
            String condition = input.get(2);

            if (condition.equals("going!")) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);

                } else {
                    guests.add(name);
                }
            } else if (condition.equals("not")) {
                if (guests.contains(name)) {
                    guests.removeIf(e -> e.equals(name));
                }else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }

        }
        if (!guests.isEmpty()){
            for (String guest : guests){
                System.out.println(guest);
            }
        }


    }
}