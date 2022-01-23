package lesson21;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> lh = new LinkedHashSet<>();
        lh.add("Hello");
        lh.add("from");
        lh.add("java");
        System.out.println(lh);
    }
}
