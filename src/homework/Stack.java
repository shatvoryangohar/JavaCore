package homework;

public class Stack {
    char[] array = new char[10];
    int index;

    Stack() {
        index = -1;
    }

    void push(char item) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            array[++index] = item;
        }
    }

    char pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
        return ' ';
        }else{
            return array[index--];
        }
    }
}
