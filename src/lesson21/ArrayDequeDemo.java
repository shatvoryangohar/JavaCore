package lesson21;
// Продемонстрировать применения класса ArrayDeque

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();
        // использовать класс ArrayDeque для организации стека

        adq.push("A");
        adq.push("B");
        adq.push("C");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.println("Извлeчeниe из стека: ");
        while (adq.peek() != null) {
            System.out.print(adq.pop() + " ");
        }
        System.out.println();
    }
}
