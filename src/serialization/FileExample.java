package serialization;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Gohar\\Documents\\Новая папка//htm";
        File file = new File(path);
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        //  long modified=file.lastModified();
        //  System.out.println(new Date(modified));
        File[] files = file.listFiles();
        for (File singleFile : files) {
            String name = singleFile.getName();
            if (name.contains(".")) {
                String[] split = name.split("//.");
                System.out.println(split[split.length - 1]);
            }
        }
        //            System.out.print(singleFile.getName() + " " + singleFile.length());
//            if (singleFile.isFile()) {
//                System.out.println(" " + "is file");
//            } else {
//                System.out.println(" " + "is directory");
//            }
//        }
//        if (!file.exists()) {
//            if (file.createNewFile()) {
//                System.out.println("file is created!");
//            }
//        }
//        System.out.println(file.exists());


    }
}

