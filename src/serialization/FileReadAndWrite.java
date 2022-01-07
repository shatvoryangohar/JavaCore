package serialization;

import java.io.*;

public class FileReadAndWrite {

    public static final String PATH_NAME = "C:\\folder\\File.txt";

    public static void main(String[] args) {

        write();
        //  read();


    }

    private static void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_NAME))) {

            bw.write("Heloo From Java\n\r");
            bw.write("Hello From Java!!!!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(PATH_NAME))) {
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
