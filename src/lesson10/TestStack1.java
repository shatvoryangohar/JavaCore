package lesson10;

public class TestStack1 {

    public static void main(String[] args) {


        Stack1 myStack2 = new Stack1();
        Stack1 myStack3 = new Stack1();

        for (int i = 0; i < 10; i++) {

            myStack2.push(i);

        }
        for (int i = 10; i < 20; i++) {

            myStack3.push(i);

        }
        System.out.println("Содержимое стека myStack2:");

        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }

        System.out.println("Содержимое стека myStack3");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack3.pop());
        }
    }
}
