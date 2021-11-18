package homework.dynamicArray;


public class DynamicArray {

    //սա մեր հիմնական մասիվն է,որտեղ պահելու ենք ավելացվող էլեմենտները։
    private int[] array = new int[10];

    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է։
    private int size = 0;

    //ստուգել,եթե մասիվի մեջ տեղ չկա -> կանչել extend() և ավելացնենք։

    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);

        }
    }

    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");

        } else {
            if (array.length == size) {
                extend();
            }
            for (int i = size - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }

    }


    public void set(int value, int index) {

        if (index < 0 || index > array.length) {
            System.err.println("invalid index");

        } else {
            array[index] = value;
        }
    }

    //1․ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
//2․քցել հին մասիվի էլեմենտները նորի մեջ
//3․հին մասիվի հղումը կապենք նոր մասիվի հղման հետ


    private void extend() {
        int[] tmp = new int[10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }

        array = tmp;
    }


    //եթե տրված ինդեքսը մեր ունեցած ինդեքսի սահմաններում է,վերադարձնել մասիվի index-երրորդ էլեմենտը։
    //հակառակ դեպքում վերադարձնել -1;

    public int getByIndex(int index) {

        if (index < 0 || index > array.length) {
            System.err.println("invalid index");
            return -1;
        }
        return array[index];
    }

    public void delete(int index) {

        for (int i = index + 1; i < size; i++) {

            array[i - 1] = array[i];

        }
        size--;

    }


    //   տպել մասիվի ավելացված էլեմենտները։
    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean isExist(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
