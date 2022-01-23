package lesson21;

import java.util.TreeSet;

// Продемонстрировать применение класса TreeSet
public class TreeSetDemo {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet

        TreeSet<String> ts = new TreeSet<>();
        // ввести элементы в древовидное множество типа TreeSet
        ts.add("A");
        ts.add("C");
        ts.add("F");
        ts.add("E");
        ts.add("B");
        ts.add("D");
        System.out.println(ts.subSet("C", "F"));
        System.out.println(ts);
    }
}
