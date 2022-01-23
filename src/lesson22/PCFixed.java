package lesson22;

public class PCFixed {
    public static void main(String[] args) {

        Q1 q = new Q1();
        new Consumer1(q);
        new Producer1(q);
        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
