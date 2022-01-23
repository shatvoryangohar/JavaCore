package lesson22;
// Неправильная реализация поставщика и потребителя

public class Q {
    int n;

    synchronized int get() {
        System.out.println("Пoлyчeнo: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Oтпpaвлeнo: " + n);
    }


}
