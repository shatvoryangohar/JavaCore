package homework.file;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please input path");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.err.println("Path does not exist or is not directory");
        } else {
            System.out.println("Please input fileName");
            String fileName = scanner.nextLine();
            File file = new File(path, fileName);
            findFile(path, fileName);
        }

    }

    static void findFile(File parent, String fileName) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFile(file, fileName);
            } else {
                if (file.getName().contains(fileName)) {
                    System.out.println(file.getAbsolutePath());
                    break;
                }
            }
        }
    }
//
//    public boolean searchFile () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please input path");
//        String path = scanner.nextLine();
//        System.out.println("please input fileName");
//        String fileName = scanner.nextLine();
//        File file = new File(path + "/" + fileName);
//        return file.exists();
//    }
}