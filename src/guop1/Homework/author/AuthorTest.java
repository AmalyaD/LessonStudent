package guop1.Homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plaese enter number");
        int num = scanner.nextInt();

        AuthorStorage authorStorage = new AuthorStorage();

        for (int i = 0; i < num; i++) {
            Author author = new Author("Poxos", "Poxosyan", "poxos@email.ru", 20, "male");
            authorStorage.add(author);
        }
        authorStorage.print();

        System.out.println("Author by index  is : " + authorStorage.getIndex(4));
    }
}
