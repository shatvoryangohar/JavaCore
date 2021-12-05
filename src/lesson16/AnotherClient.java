package lesson16;

// Еще одна реализация интерфейса Callback
public class AnotherClient implements Callback {

    // реализовать интерфейс Callback
    public void callBack(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
