package homework.file;


import java.io.*;

public class FileUtil {


    public void findLines(String txtPath, String keyword) {
        File file = new File(txtPath);
        if (file.exists()) {
            try (BufferedReader bf = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bf.readLine()) != null) {
                    if (line.contains(keyword)) {
                        System.out.println(line);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void printSizeOfPackage(String path) {
        File file = new File(path);
        long size=0;
        File[]files=file.listFiles();
        for (int i = 0; i < file.length() ; i++) {
            size=files[i].length()+size;
        }
        System.out.println((size/1024)/1024);
    }



    public void createFileWithContent(String path, String filename, String content) throws IOException {
        File file = new File(path, filename);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


