package lesson16;

public abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + "" + b);
    }
}
