package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

//        da.add(10);
//        da.add(20);
//        da.add(45);
//        //  for (int i = 0; i < 1000; i++) {
//        //       da.add(i + 1);
//        //     }
//
//
//        System.out.println(da.getByIndex(2));
//        System.out.println(da.getByIndex(500));

        for (int i = 0; i <10 ; i++) {
            da.add(i+1);
        }
        da.print();
        da.delete(4);
        System.out.println();
        da.print();
    }
}
