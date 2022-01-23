package lesson22;
// Правильная реализация поставщика и потребителя

public class Q1 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа" + "InterruptedException перехвачено");
            }
        System.out.println("Пoлyчeнo: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа" + "InterruptedException перехвачено");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Oтпpaвлeнo: " + n);
        notify();

    }
}
