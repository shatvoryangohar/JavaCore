package lesson22;
// В этой программе используется синхронизированный блок

public class CallMe1 {

    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Пpepвaнo");
        }
        System.out.println("]");
    }
}
