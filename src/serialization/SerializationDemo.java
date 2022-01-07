package serialization;

import java.io.*;

public class SerializationDemo {

    private static final String FILE_PATH = "C:\\folder\\Folder.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("Poxos", "Poxosyan", 32, "poxos@gmail.com");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Object object = objectInputStream.readObject();
        Student student1 = (Student) object;
        System.out.println(student1);
    }
}
