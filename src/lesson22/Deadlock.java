package lesson22;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b); //получить блокировку для объекта а в данном потоке исполнения
        System.out.println("Haзaд в другой поток");
    }

    public void run() {
        b.bar(a);//получить блокировку для объекта b в другом потоке исполнения
        System.out.println("Haзaд в другой поток");
    }


    public static void main(String[] args) {
        new Deadlock();
    }
}
