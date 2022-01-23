package lesson22;

public class SuspendResume {
    public static void main(String[] args) {

        NewThread4 ob1 = new NewThread4("Один");
        NewThread4 ob2 = new NewThread4("Два");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Пpиocтaнoвкa потока Один");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Boзoбнoвлeниe потока Один");
            ob2.mySuspend();
            System.out.println("Пpиocтaнoвкa потока Два");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Boзoбнoвлeниe потока Два");
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        // ожидать завершения потоков исполнения
        try {
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен");
    }
}
