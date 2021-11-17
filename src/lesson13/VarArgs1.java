package lesson13;

public class VarArgs1 {

    static void vaTest(int... v) {
        System.out.println("vaTest(int ...): " + "Количество аргументов: " + v.length + "Содержимое: ");
        for (int i : v) {
            System.out.println(i + " ");
            System.out.println();
        }
    }

    static void vaTest(boolean... v) {
        System.out.println("vaTest(boolean ...)" + "Количество аргументов: " + v.length + "Содержимое: ");

        for (boolean b : v) {
            System.out.println(b + " ");
            System.out.println();
        }
    }

    static void vaTest(String msg, int... v) {
        System.out.println("vaTest (String, int ..." + msg + v.length + "Содержимое: ");
        for (int i : v) {
            System.out.println(i + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3);
        vaTest("Проверка :", 10, 20);
        vaTest(true, false, false);
    }
}