package lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin;
        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
// Попытка открыть файл

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        }
//Теперь файл открыт и готов к чтению.
// Далее из него читаются символы до тех пор пока не встретится признак конца файла

        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Oшибкa чтения из файла");
        }

        // закрыть файл

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Oшибкa закрытия файла");
        }

    }
}
