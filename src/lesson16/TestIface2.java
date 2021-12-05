package lesson16;

public class TestIface2 {
    public static void main(String[] args) {

        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callBack(42);

        c = ob;// теперь переменная с ссылается на объект типа AnotherClient

        c.callBack(42);

    }
}
