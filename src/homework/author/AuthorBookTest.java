package homework.author;

import java.util.Scanner;

public class AuthorBookTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHOR = "3";
    private static final String SEARCH_BOOKS_BY_TITLE = "4";
    private static final String SEARCH_AUTHOR_BY_AGE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOK = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_AUTHOR = "9";
    private static final String CHANGE_AUTHOR = "10";
    private static final String CHANGE_BOOK_AUTHOR = "11";
    private static final String DELETE_AUTHOR = "12";
    private static final String DELETE_BY_AUTHOR = "13";
    private static final String DELETE_BOOK = "14";

    public static void main(String[] args) {
        Author author = new Author("Vahan", "Teryan", "teryan@gmail.com", 34, "male");
        authorStorage.add(author);
        Author author1 = new Author("Hovhannes", "Tumanyan", "tumanyan1@gmail.com", 55, "male");
        authorStorage.add(author1);
        Author author2 = new Author("Aleqsandr", "Shirvanzade", "shirvanzade@gmail.com", 58, "male");
        authorStorage.add(author2);
        bookStorage.add(new Book("աշնան մեղեդի", "ոտանավոր", 25, 1, author));
        bookStorage.add(new Book("va", "ոտանավոր", 25, 1, author));
        bookStorage.add(new Book("Քաոս", "վեպ", 35, 3, author2));
        bookStorage.add(new Book("Անխելք մարդը", "հեքիաթ", 12, 5, author1));
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR:
                    searchAuthor();
                    break;
                case SEARCH_AUTHOR_BY_AGE:
                    searchAuthorByAge();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBooksByAuthor();
                    break;
                case COUNT_BOOKS_BY_AUTHOR:
                    countBooksByAuthors();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOK:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBookByTitle();
                    break;
                case CHANGE_AUTHOR:
                    changeAuthor();
                    break;
                case CHANGE_BOOK_AUTHOR:
                    changeBookAuthor();
                    break;
                case DELETE_AUTHOR:
                    deleteAuthor();
                    break;
                case DELETE_BY_AUTHOR:
                    deleteByAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                default:
                    System.out.println("Invalid command");
            }

        }
    }

    private static void deleteBook() {
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        bookStorage.deleteBook(title);
    }

    private static void deleteByAuthor() {
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        bookStorage.deleteByAuthor(email);
    }

    private static void deleteAuthor() {
        System.out.println("Please input author email");
        String email = scanner.nextLine();
        authorStorage.deleteAuthor(email);
    }

    private static void changeBookAuthor() {
        System.out.println("Please input title");
        String title = scanner.nextLine();
        System.out.println("Please input new author email ");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        Book book = bookStorage.searchBookByTitle(title);
        if (book != null && book.getAuthor().equals(author)) {
            bookStorage.searchBookByTitle(title).setAuthor(author);
        } else {
            System.out.println("Invalid author");
        }
    }

    private static void changeAuthor() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("please input name");
        String name = scanner.nextLine();
        System.out.println("please input surname");
        String surname = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        author.setName(name);
        author.setSurname(surname);
    }

    private static void countBooksByAuthors() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        bookStorage.countBookByAuthor(email);
    }

    private static void searchBooksByAuthor() {
        System.out.println("please input author's email");
        System.out.println("-------");
        authorStorage.print();
        System.out.println("-------");
        String email = scanner.nextLine();
        bookStorage.searchBooksByAuthor(email);
    }

    private static void searchBookByTitle() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        System.out.println(bookStorage.searchBookByTitle(keyword));
    }

    private static void addBook() {
        System.out.println("please choose author's email");
        System.out.println("----------");
        authorStorage.print();
        System.out.println("----------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String description = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, description, price, count, author);

            bookStorage.add(book);

            System.out.println("Thank you! Book's was added");
        } else {
            System.out.println("Invalid email! please try again");
            addBook();
        }
    }

    private static void printCommands() {

        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("Please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("Please input " + SEARCH_AUTHOR + " for SEARCH_AUTHOR");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for SEARCH_BOOKS_BY_TITLE");
        System.out.println("Please input " + SEARCH_AUTHOR_BY_AGE + " for SEARCH_AUTHOR_BY_AGE");
        System.out.println("Please input " + PRINT_AUTHORS + " for PRINT_AUTHORS");
        System.out.println("Please input " + PRINT_BOOK + " for PRINT_BOOK");
        System.out.println("Please input " + SEARCH_BOOKS_BY_AUTHOR + " for SEARCH_BOOKS_BY_AUTHOR");
        System.out.println("Please input " + COUNT_BOOKS_BY_AUTHOR + " for COUNT_BOOKS_BY_AUTHOR");
        System.out.println("Please input " + CHANGE_AUTHOR + " for CHANGE_AUTHOR");
        System.out.println("please input " + CHANGE_BOOK_AUTHOR + " for CHANGE_BOOK_AUTHOR");
        System.out.println("Please input " + DELETE_AUTHOR + " for DELETE_AUTHOR");
        System.out.println("Please input " + DELETE_BY_AUTHOR + " for DELETE_BY_AUTHOR");
        System.out.println("Please input " + DELETE_BOOK + " for DELETE BOOK");
    }

    private static void searchAuthorByAge() {
        System.out.println("Please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchAuthorByAge(minAge, maxAge);
    }

    private static void searchAuthor() {
        System.out.println(" Please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchAuthor(keyword);
    }

    private static void addAuthor() {

        System.out.println("please,input author's name");
        String name = scanner.nextLine();
        System.out.println("please,input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please,input author's email");
        String email = scanner.nextLine();
        System.out.println("please,input author's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please,input author's gender");
        String gender = scanner.nextLine();

        Author author = new Author(name, surname, email, age, gender);

        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exist");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you! Authors was added");
        }
    }


}