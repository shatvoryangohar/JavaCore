package homework.author;

import static java.lang.System.arraycopy;

public class AuthorStorage {

    private Author[] array = new Author[10];
    private int size = 0;


    public void add(Author author) {
        if (array.length == size) {
            extend();
        }
//        boolean isFound = false;
//        for (int i = 0; i < size; i++) {
//            if (array[i].getEmail().equals(author.getEmail())) {
//                isFound = true;
//                break;
//            }
//        }
//       if(getByEmail(author.getEmail())!=null){
//           System.out.println("Invalid email.Author with this email already exist");
//       }else {

        array[size++] = author;
//       }
    }

    private void extend() {
        Author[] tmp = new Author[array.length + 10];
        //       for (int i = 0; i < size; i++) {
//            tmp[i] = array[i];
//        }
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public Author getByIndex(int index) {

        if (index < 0 || index > array.length) {
            System.err.println("invalid index");
            return null;
        }
        return array[index];
    }


    public void delete(int index) {

        for (int i = index + 1; i < size; i++) {

            array[i - 1] = array[i];

        }
        size--;

    }


    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void searchAuthor(String keyword) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword) || array[i].getSurname().contains(keyword)) {
                System.out.println(array[i]);
            }
        }
    }

    public void searchAuthorByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {

            if (array[i].getAge() >= minAge && array[i].getAge() <= maxAge) {
                System.out.println(array[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().contains(email)) {
                return array[i];
            }
        }
        return null;
    }

    public void deleteAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmail().contains(email)) {
                delete(i);
            }
        }

    }
//
//    public void changeAuthor(String name, String surname, String email) {
//        for (int i = 0; i < size; i++) {
//            if (array[i].getEmail().equals(email)) {
//                array[i].setName(name);
//                array[i].setSurname(surname);
//            }

    //      }

//    }
}
