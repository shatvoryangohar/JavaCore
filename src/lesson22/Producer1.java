package lesson22;

public class Producer1 implements Runnable {
    Q1 q;

    Producer1(Q1 q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }


    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
