package lesson17;
// В этой программе создается специальный тип исключения

public class MyException extends Exception {

    private int detail;

    MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
