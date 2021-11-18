package homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();

        System.out.println("please,input a");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            Author author = new Author("Վահան", "Տերյան", "vahanteryan@gmail.com", 34, "արական");
            authorStorage.add(author);
        }
        authorStorage.print();
    }
}
