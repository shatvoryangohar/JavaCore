package homework.arrayutil;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {3, 6, 9, 15, 34, 56, 60, 95, 115, 136};

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();
        int evens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens++;
            }
        }
        System.out.println(evens);


        int odds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                odds++;
            }
        }
        System.out.println(odds);

        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        System.out.println(average / array.length);


        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        System.out.println(total);


        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(max);

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }


    }
}



