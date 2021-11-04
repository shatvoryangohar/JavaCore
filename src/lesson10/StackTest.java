package lesson10;

public class StackTest {

    public static void main(String[] args) {


        Stack stack = new Stack();

        stack.push(45);
        stack.push(55);
        stack.push(65);

        System.out.println(stack.pop());
      //  System.out.println(stack.pop());
      //  System.out.println(stack.pop());

        stack.push(75);
        stack.push(85);

        System.out.println(stack.pop());
    }
}
