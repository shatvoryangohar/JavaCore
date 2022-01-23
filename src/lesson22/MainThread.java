package lesson22;

public class MainThread {
    public static void main(String[] args) {

        Thread newThread = new Thread(new MyThread(), "demo Thread");
        newThread.start();
        System.out.println("main thread finished");
    }
}
