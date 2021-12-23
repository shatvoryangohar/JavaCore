package homework.file;

import java.io.IOException;

public class FileUtilTest {
    public static void main(String[] args) throws IOException {

    FileUtil fileUtil=new FileUtil();

//  fileUtil.printSizeOfPackage("C:\\Users\\Gohar\\Documents\\Новая папка");



 //  fileUtil.printSizeOfPackage("C:\\folder");
   fileUtil.createFileWithContent("C:\\folder","example.txt","barev");
    }
}
