package homework.treadFile;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class KeywordLineThread implements Runnable {
    public Thread thread;
    private List<String> list;
    private String keyword;
    private AtomicInteger countOfKeywod;


    public KeywordLineThread( List<String> list, String keyword, AtomicInteger countOfKeywod) {
        this.list = list;
        this.keyword = keyword;
        this.countOfKeywod = countOfKeywod;

        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {

        for (String string : list) {
            if (string.contains(keyword)) {
                countOfKeywod.incrementAndGet();
            }
        }

    }
}

