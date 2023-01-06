package FinalExamRetake;

import java.util.*;

public class heroRecruitment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> heroes = new LinkedHashMap<>();
        String command = scanner.nextLine();


        while (!command.equals("End")) {
            String heroName = command.split("\\s+")[1];
            if (command.contains("Enroll")) {
                if (!heroes.containsKey(heroName)) {
                    heroes.put(heroName, new ArrayList<>());
                } else {
                    System.out.printf("%s is already enrolled.", heroName);
                }
            } else if (command.contains("Learn")) {
                if (heroes.containsKey(heroName)) {
                    spell(heroes, command, heroName);
                } else {
                    System.out.printf("%s doesn't exist.", heroName);
                }
            } else if (command.contains("Unlearn")) {
                if (heroes.containsKey(heroName)) {
                    unlearnSpell(heroes, command, heroName);
                } else {
                    System.out.printf("%s doesn't exist.", heroName);
                }
            }
        }
        printHeroes(heroes);
    }

    private static void printHeroes(Map<String, List<String>> heroesMap) {
        System.out.println("Heroes:");
        heroesMap.forEach((hero, spells) -> System.out.println(String.format("== %s: ", hero) + String.join(", ", spells)));
    }

    private static Map<String, List<String>> unlearnSpell(Map<String, List<String>> heroesMap, String command, String heroName) {
        boolean isSpellPresent = false;
        String spell = command.split("\\s+")[2];
        for (int i = 0; i < heroesMap.get(heroName).size(); i++) {
            if (heroesMap.get(heroName).get(i).equals(spell)) {
                heroesMap.get(heroName).remove(i);
                isSpellPresent = true;
                break;
            }
        }
        if (!isSpellPresent) {
            System.out.printf("%s doesn't know %s.\n", heroName, spell);
        }
        return heroesMap;
    }

    private static Map<String, List<String>> spell (Map<String, List<String>> heroesMap, String command, String heroName) {
        boolean isSpellPresent = false;
        String spell = command.split("\\s+")[2];
        for (int i = 0; i < heroesMap.get(heroName).size(); i++) {
            if (heroesMap.get(heroName).get(i).equals(spell)) {
                System.out.printf("%s has already learnt %s.", heroName, spell);
                isSpellPresent = true;
                break;
            }
        }
        if (!isSpellPresent) {
            heroesMap.get(heroName).add(spell);
        }
        return heroesMap;
    }
}