package lesson22;

public class Consumer1 implements Runnable {
    Q1 q;

    Consumer1(Q1 q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }


    @Override
    public void run() {
        while (true) {
            q.get();
        }

    }
}
