package homework.author;

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

    public Book searchBookByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                return books[i];
            }
        }
        return null;
    }

    public void searchBooksByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().getEmail().contains(email)) {
                System.out.println(books[i]);
            }
        }

    }

    public void countBookByAuthor(String email) {
        int count = 0;
        for (int i = 0; i < size; i++) {

            if (books[i].getAuthor().getEmail().contains(email)) {
                count++;
            }
        }
        System.out.println(count);
    }




}




