package homework.education.storage;

import homework.education.exception.UserNotFoundException;
import homework.education.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {

    Map<String, User> userMap = new HashMap<>();

    public void add(String type, User user) {
//        if (users.length == size) {
//            extend();
//        }
        userMap.put(type, user);
    }
//
//    private void extend() {
//
//        User[] array = new User[users.length + 10];
//        System.arraycopy(users, 0, array, 0, users.length);
//        users = array;
//
//    }

    public void print() {
        userMap.toString();
        //        for (int i = 0; i < size; i++) {
//            System.out.println(users[i]);
//        }
    }

//
//    public User getByEmailAndPassword(String email, String password) {
//        for (int i = 0; i < size; i++) {
//
//            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)) {
//                return users[i];
//            }
//        }
//
//        return null;
//    }

    public User getByEmail(String email) throws UserNotFoundException {
        for (Map.Entry<String, User> entry : userMap.entrySet()) {
            if (entry.getValue().equals(entry)) {
                return entry.getValue();
            }

        }
        throw new UserNotFoundException("User does not exist. Email: " + email);
    }

}
