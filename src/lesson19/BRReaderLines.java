package lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReaderLines {
    //Чтение символьных строк с консоли средствами класса BufferedReader
    public static void main(String[] args) throws IOException {
        //создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Bвeдитe строки текста.");
        System.out.println("Bвeдитe 'стоп' для завершения.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));


    }
}
