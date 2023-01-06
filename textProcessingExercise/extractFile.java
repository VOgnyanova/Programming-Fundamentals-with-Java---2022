package textProcessingExercise;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] file = path.split("\\\\");
        String files = file[file.length - 1];
        String fileName = files.split("\\.")[0];
        String extension = files.split("\\.")[1];


        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);

    }
}
