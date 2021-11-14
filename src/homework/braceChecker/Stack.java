package homework.braceChecker;

public class Stack {

    private int[] array = new int[10];
    private int index;

    Stack() {
        index = -1;
    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            array[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            return 0;
        } else {
            return array[index--];
        }
    }

    public boolean isEmpty() {
        return index == -1;
    }

}
