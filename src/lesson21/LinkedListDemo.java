package lesson21;

import java.util.LinkedList;

// Продемонстрировать применение класса LinkedList
public class LinkedListDemo {
    public static void main(String[] args) {
        // создать связный список
        LinkedList<String> ll = new LinkedList<>();
        // ввести элементы в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Иcxoднoe содержимое связного " + "списка 11 : " + ll);
        ll.remove("F"); // удалить указанные элементы
        ll.remove(2); // из связного списка
        System.out.println("Coдepжимoe связного списка 11 " + "после удаления элементов: " + ll);
        ll.removeFirst(); // удалить первый и последний
        ll.removeLast(); // элементы из связного списка
        System.out.println("Coдepжимoe связного списка 11 " + "после удаления первого и "
                + "последнего элементов: " + " " + ll);
        // получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + "изменено");
        System.out.println("Coдepжимoe связного списка 11 " + "после изменения: " + ll);
    }
}
