package lesson13;

public class Outer {
    // Продемонстрировать применение внутреннего класса

    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
//это внутренний класс
    class Inner {
        void display() {
            System.out.println("Вывод:outer_x= " + outer_x);
        }
    }


}

