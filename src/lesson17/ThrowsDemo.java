package lesson17;

//Эта программа содержит ошибку и поэтому она не подлежит компиляции
public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException {
        System.out.println("B теле метода throwOne() .");
        throw new IllegalAccessException("дeмoнcтpaция");

    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Пepexвaчeнo исключение: " + e);
        }
    }
}