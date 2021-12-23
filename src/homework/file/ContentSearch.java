package homework.file;

import java.io.*;
import java.util.Scanner;

public class ContentSearch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input path");
        String pathStr = scanner.nextLine();
        File path = new File(pathStr);
        if (!path.exists() || path.isFile()) {
            System.err.println("path does not exist or is not directory ");
        } else {
            System.out.println("please input keyword");
            String keyword = scanner.nextLine();
            findFile(path, keyword);
        }
    }

    static void findFile(File parent, String keyword) {
        for (File file : parent.listFiles()) {
            if (file.isDirectory()) {
                findFile(parent, keyword);
            } else {
                if (file.getName().endsWith(".txt")) {
                    searchKeyword(file, keyword);
                }
            }
        }
    }

    private static void searchKeyword(File file, String keyword) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line = " ";
            int lineNumber = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                if (line.contains(keyword)) {
                    System.out.println(file.getAbsolutePath() + "line:" + lineNumber);
                    break;
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public boolean textSearch() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input path");
//        String path = scanner.nextLine();
//        System.out.println("Please input fileName");
//        String fileName = scanner.nextLine();
//        System.out.println("Please input text");
//        String text = scanner.nextLine();
//        File file = new File(path + "/" + fileName + "/" + text);
//        try (BufferedInputStream buf = new BufferedInputStream(new FileInputStream(file))) {
//            byte[] bytes = new byte[(int) file.length()];
//            buf.read(bytes);
//            String content = new String(bytes);
//            if (content.contains(text)) {
//                return true;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return false;
//    }

}



