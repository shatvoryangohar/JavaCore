package lesson22;
//Создать несколько потоков исполнения

public class NewThread2 implements Runnable {
    String name;
    Thread t;

    //имя потока исполнения
    NewThread2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        t.start();

    }

//Точка входа в поток исполнения

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен.");
    }
}
