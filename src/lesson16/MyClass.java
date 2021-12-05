package lesson16;
// Этот класс должен реализовать все методы
//из интерфейсов А и В
public class MyClass implements B1{

    @Override
    public void meth1() {
        System.out.println("Peaлизaция метода meth1() .");
    }

    @Override
    public void meth2() {
        System.out.println("Peaлизaция метода meth2() .");
    }

    @Override
    public void meth3() {
        System.out.println("Peaлизaция метода meth3() .");
    }
}
