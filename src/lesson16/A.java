package lesson16;

// Пример вложенного интерфейса
public class A {
    //Этот класс содержит интерфейс как свой член

// это вложенный интерфейс

    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
