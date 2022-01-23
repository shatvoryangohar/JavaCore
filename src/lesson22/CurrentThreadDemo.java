package lesson22;
// Управление главным потоком исполнения
public class CurrentThreadDemo {
    public static void main(String[] args) {

    Thread t=Thread.currentThread();
        System.out.println("Teкyщий поток исполнения: "+t);

        // изменить имя потока исполнения

    t.setName("MyThread");
        System.out.println("Пocлe изменения имени потока: "+t);

try{
    for (int i = 5; i >0 ; i--) {
        System.out.println(i);
    Thread.sleep(1000);
    }
}catch (InterruptedException e){
    System.out.println("Главный поток исполнения прерван");
}
    }
}
