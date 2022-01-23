package lesson21;

import java.util.HashSet;

// Продемонстрировать применение класса HashSet
public class HashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множество
        HashSet<String> st = new HashSet<>();
        // ввести элементы в хеш-множество
        st.add("Бета");
        st.add("Альфа");
        st.add("Эта");
        st.add("Гамма");
        st.add( "Эпсилон");
        st.add( "Омега");
        System.out.println(st);

    }
}
