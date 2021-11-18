package homework.author;

public class AuthorStorage {

    private Author[] array = new Author[10];
    private int size = 0;


    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }

        array = tmp;
    }

    public Author getByIndex(int index) {

        if (index < 0 || index > array.length) {
            System.err.println("invalid index");
            return null;
        }
        return array[index];
    }

    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
