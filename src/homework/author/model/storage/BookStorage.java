package homework.author.model.storage;

import homework.author.util.ArrayUtil;
import homework.author.model.Author;
import homework.author.model.Book;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (books.length == size) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];

        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }


    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(books[i] + " ");
        }

    }


    public Book getBySerialId(String serialId) {
        for (int i = 0; i < size; i++) {
            if (books[i].getSerialId().equals(serialId)) {
                return books[i];
            }
        }
        return null;
    }

    public Book searchBookByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                return books[i];
            }
        }
        return null;
    }

    public void searchBooksByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            for (Author author1 : books[i].getAuthor()) {

                if (author1.equals(author)) {
                    System.out.println(books[i]);
                }
            }
        }
    }

    public void countBookByAuthor(Author author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (Author author1 : books[i].getAuthor()) {
                if (author1.equals(author)) {
                    count++;
                }
            }
        }
        System.out.println("Count of" + author.getEmail() + "author's book is " + count);
    }


    public void deleteBooksByAuthor(Author author) {
        for (int i = 0; i < books.length; i++) {
            for (Author author1 : books[i].getAuthor()) {
                if (author1.equals(author)) {
                    ArrayUtil.delete(books, i, size);
                    size--;
                }
            }


        }
    }

    public void deleteBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                ArrayUtil.delete(books, i, size);
                size--;
                break;
            }
        }
    }
}




