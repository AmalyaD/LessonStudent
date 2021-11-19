package guop1.Homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number");
        int num = scanner.nextInt();
        System.out.println("Please enter the name: ");
        String name = scanner.next();
        System.out.println("Pleas enter the surname: ");
        String surname = scanner.next();
        System.out.println("Pleas enter the email: ");
        String email = scanner.next();
        System.out.println("Pleas enter the gender: ");
        String gender = scanner.next();
        System.out.println("Pleas enter the age: ");
        int age = scanner.nextInt();


        AuthorStorage authorStorage = new AuthorStorage();

        for (int i = 0; i < num; i++) {
            Author author = new Author(name,surname,email,age, gender);
            authorStorage.add(author);
        }
        authorStorage.print();

      //  System.out.println("Author by index  is : " + authorStorage.getIndex(4));
    }
}
