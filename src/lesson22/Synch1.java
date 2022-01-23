package lesson22;

public class Synch1 {
    public static void main(String[] args) {

        CallMe1 target = new CallMe1();
        Caller1 ob1 = new Caller1(target, "Добро пожаловать");
        Caller1 ob2 = new Caller1(target, "в синхронизированный");
        Caller1 ob3 = new Caller1(target, "мир!");
        //ожидать завершения потока исполнения
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }

    }
}
