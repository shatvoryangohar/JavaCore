package lesson16;

public class DynStack implements IntStack {

    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        // если стек заполнен, выделить памят под стек большего размера
        if (tos == stck.length - 1) {
            int tmp[] = new int[stck.length * 2];

            // удвоить размер стека
            for (int i = 0; i < stck.length; i++) {
                tmp[i] = stck[i];
            }
            stck = tmp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }

    }

    // извлечь элемент из стека
    @Override
    public int рор() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");

            return 0;
        } else {
            return stck[tos--];
        }
    }
}
