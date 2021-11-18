package homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();

        System.out.println("please,input a");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("please,input name");
            String name= scanner.next();
            System.out.println("please,input surname");
            String surname = scanner.next();
            System.out.println("please,input email");
            String email=scanner.next();
            System.out.println("please,input age");
            int age =scanner.nextInt();
            System.out.println("gender");
            String gender= scanner.next();
            Author author = new Author(name,surname,email,age,gender);

            authorStorage.add(author);
        }
        authorStorage.print();
    }
}
