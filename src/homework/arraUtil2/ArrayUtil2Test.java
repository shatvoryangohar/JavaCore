package homework.arraUtil2;

public class ArrayUtil2Test {

    public static void main(String[] args) {


        ArrayUtil2 arrayUtil2 = new ArrayUtil2();


        int[] numbers = {3, 6, 9, 15, 34, 56, 60, 95, 115, 136};

        int[] numbers2 = {300, 6, 933, 15555, 34, 56, 60, 95, 115, 136};


        arrayUtil2.print(numbers);
        System.out.println();

        System.out.println(arrayUtil2.evens(numbers));

        System.out.println(arrayUtil2.odds(numbers));

        System.out.println(arrayUtil2.average(numbers));

    System.out.println(arrayUtil2.total(numbers));



        System.out.println(arrayUtil2.max(numbers));



        System.out.println(arrayUtil2.min(numbers));


        arrayUtil2.twain(numbers);


        arrayUtil2.odd(numbers);
        System.out.println();
        arrayUtil2.sort(numbers2);
        arrayUtil2.print(numbers2);

    }
}
