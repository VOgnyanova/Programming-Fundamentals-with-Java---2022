package orderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class personsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Persons> personList = new ArrayList<>();

        while (!command.equals("End")) {
            String name = command.split(" ")[0];
            String id = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);

            Persons persons = new Persons(name, id, age);
            personList.add(persons);

            command = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Persons::getAge));
        for (Persons persons: personList){
            System.out.println(persons);
        }
    }
}
