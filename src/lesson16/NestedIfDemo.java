package lesson16;

public class NestedIfDemo {
    public static void main(String[] args) {
        // использовать ссылку на вложенный интерфейс

        A.NestedIF nif = new B();

        if (nif.isNotNegative(10)) {
            System.out.println("Чиcлo 10 неотрицательное");
        }
        if (nif.isNotNegative(-12))
            System.out.println("Этo не будет выведено");
    }
}
