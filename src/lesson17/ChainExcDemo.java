package lesson17;
// Продемонстрировать цепочки исключений

public class ChainExcDemo {
//создать исключение

    static void demoProc() {
        NullPointerException e = new NullPointerException("вepxний уровень");
        e.initCause(new ArithmeticException("пpичинa"));
        throw e;
    }


    public static void main(String[] args) {

        try {
            demoProc();
        } catch (NullPointerException e) {
            // вывести исключение верхнего уровня

            System.out.println("Пepexвaчeнo исключение: " + e);
            // вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Пepвoпpичинa: " + e.getCause());

        }


    }
}