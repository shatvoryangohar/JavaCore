package homework.education.storage;

import homework.education.model.User;

public class UserStorage {

    User[] users = new User[10];
    int size;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {

        User[] array = new User[users.length + 10];
        System.arraycopy(users, 0, array, 0, users.length);
        users = array;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User getByName(String name) {
        for (int i = 0; i < size; i++) {

            if (users[i].getName().equals(name)) {
                return users[i];
            }
        }
        return null;
    }

    public User getByEmailAndPassword(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
