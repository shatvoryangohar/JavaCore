package lesson21;

import java.util.ArrayList;

// Продемонстрировать применение класса ArrayList
public class ArrayListDemo {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Haчaльный размер списочного " + "массива al: " + al.size());
        // ввести элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Paзмep списочного массива al " + "после ввода элементов: " + al.size());
        // вывести списочный массив
        System.out.println("Coдepжимoe списочного массива al: " + al);

        // удалить элементы из списочного массива
        al.remove("F");
        al.remove(2);
        System.out.println("Paзмep списочного массива al " + "после удаления элементов:" + al.size());
        System.out.println("Coдepжимoe списочного массива al: " + al);

    }
}
