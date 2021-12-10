package homework.author;

import homework.author.model.Author;
import homework.author.model.Book;
import homework.author.model.storage.AuthorStorage;
import homework.author.model.storage.BookStorage;
import homework.author.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class AuthorBookTest implements AuthorBookCommands {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) throws ParseException {

        Author author = new Author("poxos", "poxosyan", "poxos@gmail.com", 12, "male", DateUtil.stringToDate("12/12/2012"));
        authorStorage.add(author);
        Author author1 = new Author("petros", "petrosyan", "petros@gmail.com", 25, "male", DateUtil.stringToDate("21/11/1999"));
        authorStorage.add(author1);
        Author[] authors = {author1, author};
        bookStorage.add(new Book("Au5555", "girq1", "desq", 16, 4, authors));

        initData();
        boolean isRun = true;
        while (isRun) {
            AuthorBookCommands.printCommands();
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
                    deleteBooksByAuthor();
                    break;
                case DELETE_BOOK:
                    deleteBook();
                    break;
                case ADD_TAG_TO_BOOK:
                    addTagsOfBook();
                case REMOVE_TAG_FROM_BOOK:
                    removeTagFromBook();
                default:
                    System.out.println("Invalid command");
            }

        }
    }

    private static void removeTagFromBook() {
        System.out.println("please choose book by serialId");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            String tagsStr = scanner.nextLine();
            System.out.println("Please input tags separate ,");
            String[] tagsToRemove = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                System.err.println("Book does not have any tags to remove!!!");
            } else {
                for (String tag : tagsToRemove) {
                    boolean isExist = false;
                    for (String bookTag : bookTags) {
                        if (bookTag.equals(tag)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        System.err.println(tag + " does not exist book: " + book);
                        return;
                    }
                }
                String[] newTags = new String[bookTags.length - tagsToRemove.length];
                int index = 0;
                for (String bookTag : bookTags) {
                    boolean isExist = false;
                    for (String toRemove : tagsToRemove) {
                        if (bookTag.equals(toRemove)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        newTags[index++] = bookTag;
                    }
                }
                book.setTags(newTags);
            }
        }

    }


    private static void addTagsOfBook() {
        System.out.println("please choose book by serialId");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            String tagsStr = scanner.nextLine();
            System.out.println("Please input tags separate ,");
            String[] tags = tagsStr.split(",");
            String[] bookTags = book.getTags();
            if (bookTags == null) {
                book.setTags(tags);
                System.err.println("Tags were added!");
            } else {
                for (String tag : tags) {
                    for (String bookTag : bookTags) {
                        if (tag.equals(bookTag)) {
                            System.err.println(tag + " is duplicate.Please input new Tags");
                            return;
                        }
                    }
                }
                String[] newTags = new String[bookTags.length + tags.length];
                System.arraycopy(bookTags, 0, newTags, 0, bookTags.length);
                System.arraycopy(tags, 0, newTags, bookTags.length, tags.length);
                book.setTags(newTags);
                System.err.println("Tags were added!");
            }
        }
    }

    private static void initData() throws ParseException {
        Author author = new Author("Vahan", "Teryan", "teryan@gmail.com", 34, "male", DateUtil.stringToDate("28/12/1989"));
        Author author1 = new Author("Hovhannes", "Tumanyan", "tumanyan1@gmail.com", 55, "male", DateUtil.stringToDate("27/01/1992"));
        Author author2 = new Author("Aleqsandr", "Shirvanzade", "shirvanzade@gmail.com", 58, "male", DateUtil.stringToDate("25/12/1993"));
        authorStorage.add(author);
        authorStorage.add(author1);
        authorStorage.add(author2);
        Author[] authors = {author1, author2};
        String[] tags = {"new", "detective", "popular"};
        bookStorage.add(new Book("girq1", "desq", 2, 35, "Ah25642", authors, tags));
    }

    private static void deleteBook() {
        System.out.println("please choose book by serialId");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            bookStorage.deleteBook(book);
        } else {
            System.err.println("Book with serialId does not exists");
        }
    }

    private static void deleteBooksByAuthor() {
        System.out.println("please choose author's email");
        System.out.println("-------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.deleteBooksByAuthor(author);

        } else {
            System.out.println("Author does not exists ");
        }
    }

    private static void deleteAuthor() {
        System.out.println("please choose author's email");
        System.out.println("-------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            authorStorage.deleteAuthor(author);
        } else {
            System.out.println("Author does not exists ");
        }
    }

    private static void changeBookAuthor() {
        System.out.println("please choose book by serialId");
        System.out.println("-------");
        bookStorage.print();
        System.out.println("-------");
        String serialId = scanner.nextLine();
        Book book = bookStorage.getBySerialId(serialId);
        if (book != null) {
            System.out.println("please choose author's email ");
            System.out.println("-------");
            String emails = scanner.nextLine();
            String[] emailArray = emails.split(",");
            if (emailArray.length == 0) {
                System.out.println("Please choose authors");
                return;
            }
            Author[] authors = new Author[emailArray.length];
            int index = 0;
            for (String email : emailArray) {
                Author author = authorStorage.getByEmail(email);
                if (author != null) {
                    authors[index++] = author;
                } else {
                    System.out.println("Please input correct author's email");
                    return;
                }
            }
            book.setAuthor(authors);
        } else {
            System.err.println("Book with serialId does not exists");
        }

    }

    private static void changeAuthor() {
        System.out.println("please choose author's email");
        System.out.println("-------");
        authorStorage.print();
        System.out.println("-------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input name");
            String name = scanner.nextLine();
            System.out.println("please input surname");
            String surname = scanner.nextLine();
            System.out.println("please,input author's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please,input author's gender");
            String gender = scanner.nextLine();
            author.setName(name);
            author.setSurname(surname);
            author.setAge(age);
            author.setGender(gender);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void countBooksByAuthors() {
        System.out.println("please input author's email");
        System.out.println("-------");
        authorStorage.print();
        System.out.println("-------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.countBookByAuthor(author);
        } else {
            System.err.println("Author does not exists");
        }

    }

    private static void searchBooksByAuthor() {
        System.out.println("please input author's email");
        System.out.println("-------");
        authorStorage.print();
        System.out.println("-------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            bookStorage.searchBooksByAuthor(author);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void searchBookByTitle() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        System.out.println(bookStorage.searchBookByTitle(keyword));
    }

    private static void addBook() {
        System.out.println("please choose author's email separate ,");
        System.out.println("----------");
        authorStorage.print();
        System.out.println("----------");
        String emails = scanner.nextLine();
        String[] emailArray = emails.split(",");
        if (emailArray.length == 0) {
            System.out.println("Please choose authors");
            return;
        }
        Author[] authors = new Author[emailArray.length];
        int index = 0;
        for (String email : emailArray) {
            Author author = authorStorage.getByEmail(email);
            if (author != null) {
                authors[index++] = author;
            } else {
                System.out.println("please input correct author's email");
                return;
            }
        }

        System.out.println("please input book's serialId");
        String serialId = scanner.nextLine();
        if (bookStorage.getBySerialId(serialId) == null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String description = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            System.out.println();
            System.out.println("Please input book's tags separate ,");
            String tagsStr = scanner.nextLine();
            String[] tags = tagsStr.split(",");

            Book book = new Book(title, description, price, count, serialId, authors, tags);

            bookStorage.add(book);

            System.out.println("Thank you! Book's was added");
        } else {
            System.err.println("Book with serialId: " + serialId + " is exists");
        }
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

    private static void addAuthor() throws ParseException {

        System.out.println("please,input author's name,surname,email,age,gender,dateOfBirth[12/12/2021");
        String authorDataStr = scanner.nextLine();
        String[] authorData = authorDataStr.split(",");
        if (authorData.length == 6) {
            int age = Integer.parseInt(authorData[3]);
            Date data = DateUtil.stringToDate(authorData[5]);
            Author author = new Author(authorData[0], authorData[1], authorData[2], age, authorData[4], data);

            if (authorStorage.getByEmail(author.getEmail()) != null) {
                System.err.println("Invalid email. Author with this email already exist");
            } else {
                authorStorage.add(author);
                System.out.println("Thank you! Authors was added");
            }
        } else {
            System.err.println("Invalid data");
        }
    }

}