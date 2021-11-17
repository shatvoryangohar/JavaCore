package lesson13;

public class TestStack2 {
    public static void main(String[] args) {

        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

//разместить числа в стеке

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        // извлечь эти числа из стека
        System.out.println("Стек в myStack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(myStack1.pop());
        }
        System.out.println("Стек в myStack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack2.pop());
        }

    }
}
