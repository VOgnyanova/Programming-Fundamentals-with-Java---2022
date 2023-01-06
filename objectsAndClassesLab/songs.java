package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class songs {
    static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfSongs = Integer.parseInt(scanner.nextLine());

        List<Song> listSongs = new ArrayList<>();

        for (int i = 0; i < numbersOfSongs; i++) {

            String inputLine = scanner.nextLine();
            String[] inputSongArr = inputLine.split("_");

            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            listSongs.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }

    }

    public static class randomizeWords {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String[] words = input.split("\\s+");
            Random rnd = new Random();

            for(int i = 0; i < words.length; i++) {
                int indexX = rnd.nextInt(words.length);
                int indexY = rnd.nextInt(words.length);

                String  oldWords = words[indexX];
                words[indexX] = words[indexY];
                words[indexY] = oldWords;

            }
            System.out.println(String.join(System.lineSeparator(),words));

        }


    }
}
