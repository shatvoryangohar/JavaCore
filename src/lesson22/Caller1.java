package lesson22;

public class Caller1 implements Runnable {
    String msg;
    CallMe1 target;
    Thread t;

    public Caller1(CallMe1 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    // синхронизированные вызовы метода call()
    @Override
    public void run() {
        synchronized (target) {
            //синхронизированный блок
            target.call(msg);
        }
    }
}
