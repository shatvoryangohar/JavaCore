package lesson16;

public class Client implements Callback {

// реализовать интерфейс Callback

    public void callBack(int p) {
        System.out.println("Meтoд callback(), "
                + " вызываемый со значением " + p);
    }


    void noniFaceMath() {
        System.out.println("B классах, реализующих интерфейсы,"
                + "могут определяться и другие члены.");
    }


}
