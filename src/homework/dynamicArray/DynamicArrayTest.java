package homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(10);
        da.add(20);
        da.add(45);

        System.out.println(da.getByIndex(2));
        System.out.println(da.getByIndex(500));

        da.print();

    }
}
