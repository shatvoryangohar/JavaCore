package serialization;

import java.io.*;

public class DataIOStream {

    public static final String PATH_NAME = "C:\\folder";

    public static void main(String[] args) throws IOException {

        read();
        write();


    }

    private static void write() throws IOException {

        DataOutputStream out = new DataOutputStream(new FileOutputStream(PATH_NAME));
        out.writeInt(33);
        out.writeBoolean(false);
        out.close();
    }


    private static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(PATH_NAME));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        inputStream.close();
    }
}
