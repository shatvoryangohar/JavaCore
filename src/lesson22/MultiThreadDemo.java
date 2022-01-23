package lesson22;

public class MultiThreadDemo {
    public static void main(String[] args) {

        new NewThread2("Oдин");//запустить потоки на исполнение
        new NewThread2("Два");
        new NewThread2("Три");

        try {
            Thread.sleep(10000);
            //ожидать завершения других потоков исполнения

        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }

        System.out.println("Глaвный поток завершен.");


    }
}
