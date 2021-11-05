package homework.dynamicArray;


public class DynamicArray {

    //սա մեր հիմնական մասիվն է,որտեղ պահելու ենք ավելացվող էլեմենտները։
    private int[] array = new int[10];

    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է։
    private int size = 0;

    //ստուգել,եթե մասիվի մեջ տեղ չկա -> կանչել extend() և ավելացնենք։

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }
//1․ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
//2․քցել հին մասիվի էլեմենտները նորի մեջ
//3․հին մասիվի հղումը կապենք նոր մասիվի հղման հետ


    private void extend() {
        int[] arrayUtil = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            arrayUtil[i] = array[i];

        }
        array = arrayUtil;
    }


    //եթե տրված ինդեքսը մեր ունեցած ինդեքսի սահմաններում է,վերադարձնել մասիվի index-երրորդ էլեմենտը։
    //հակառակ դեպքում վերադարձնել -1;

    public int getByIndex(int index) {
        if (index > array.length) {
            return -1;
        } else {
            return array[index];
        }
    }


//   տպել մասիվի ավելացված էլեմենտները։
    public void print() {
        for (int i = 0; i < array.length; i++) {
           if(array[i]!=0)
            System.out.println(array[i]);
        }
    }

}
