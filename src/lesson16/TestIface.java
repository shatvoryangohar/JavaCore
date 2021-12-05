package lesson16;

public class TestIface {

    public static void main(String[] args) {

        Callback c = new Client();
        c.callBack(42);


    }
}
