package article;


import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();

        String[] articleParts = articleData.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        articles article = new articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int commandCount = 1; commandCount <= n; commandCount++) {
            String command = scanner.nextLine();
            if (command.contains("Edit")) {
                String newContent = command.split(": ")[1];
                article.edit(newContent);
            } else if (command.contains("Rename")) {

                String newTitle = command.split(": ")[1];
                article.rename(newTitle);
            } else if (command.contains("ChangeAuthor")) {

                String newAuthor = command.split(": ")[1];
                article.changeAuthor(newAuthor);
            }
        }

        System.out.println(article.toString());
    }
}

