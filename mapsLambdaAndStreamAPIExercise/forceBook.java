package mapsLambdaAndStreamAPIExercise;

import java.util.*;

public class forceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        Map<String, List<String>> maps = new LinkedHashMap<>();


        while (!command.equals("Lumpawaroo")) {

            if (command.contains(" | ")) {
                String group = command.split("\\s+\\|\\s+")[0];
                String user = command.split("\\s+\\|\\s+")[1];

                if (!maps.containsKey(group)) {
                    maps.put(group, new ArrayList<>());
                }
                boolean isExistUSer = false;
                for (List<String> listUsers : maps.values()) {
                    if (listUsers.contains(user)) {
                        isExistUSer = true;
                        break;
                    }
                }
                if (!isExistUSer) {
                    maps.get(group).add(user);
                }

            } else if (command.contains(" -> ")) {
                String user = command.split("\\s+->\\s+")[0];
                String group = command.split("\\s+->\\s+")[1];

                maps.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (maps.containsKey(group)){
                    maps.get(group).add(user);
                }else {
                    maps.put(group, new ArrayList<>());
                    maps.get(group).add(user);
                }

                System.out.printf("%s joins the %s side!%n",user,group);

            }

            command = scanner.nextLine();

        }
        maps.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {

                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! "+ user));
                });
    }
}
