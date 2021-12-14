package homework.author.storage;

import homework.author.model.User;

public class UserStorage {

    User[] users = new User[10];
    int size;

    public void addUser(User user) {
        if (size == users.length) {
            extend();
        } else {
            users[size++] = user;
        }
    }

    private void extend() {

        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }
}
