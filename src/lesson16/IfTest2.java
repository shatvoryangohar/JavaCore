package lesson16;

public class IfTest2 {
    public static void main(String[] args) {


        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        //В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) {
            myStack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            myStack2.push(i);
        }
        System.out.println("Cтeк в mystackl:");
        for (int i = 0; i < 12; i++) {
            System.out.println(myStack1.рор());
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(myStack2.рор());
        }
    }
}
