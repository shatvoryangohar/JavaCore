package lesson19;

public class MyClass1 {
    int a;
    int b;

    MyClass1(int i, int j) {
        a = i;
        b = j;
    }

    // инициализировать поля а и Ь одним и тем же значением
    MyClass1(int i) {
        this(i, i);// по этой ссылке вызывается конструктор MyClass(i,i);
    }

    MyClass1() {
        this(0);// а по этой ссылке вызывается конструктор MyClass(0)
    }
}
