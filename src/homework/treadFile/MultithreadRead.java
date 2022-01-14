package homework.treadFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MultithreadRead {
    public static String path = "C:\\Users\\Gohar\\Documents\\Новая папка\\sample.txt";
    public static String keyword = ";";
    public static AtomicInteger countOfKeyword = new AtomicInteger();

    public static void main(String[] args) throws Exception {
        long count = Files.lines(Paths.get(path)).count();

        List<String> lines = Files.readAllLines(Paths.get(path));
        System.out.println("all lines " + count);
        int start = 0;
        int end = (int) (count / 3);

        List<String> sub1 = lines.subList(start, end);
        List<String> sub2 = lines.subList(end, end * 2);
        List<String> sub3 = lines.subList((end * 2), (int) count);
        long currentTime = System.currentTimeMillis();

        KeywordLineThread thread1 = new KeywordLineThread(sub1, keyword, countOfKeyword);
        KeywordLineThread thread2 = new KeywordLineThread(sub2, keyword, countOfKeyword);
        KeywordLineThread thread3 = new KeywordLineThread(sub3, keyword, countOfKeyword);

        thread1.thread.join();
        thread2.thread.join();
        thread3.thread.join();

        System.out.println("found lines " + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));


    }
}
