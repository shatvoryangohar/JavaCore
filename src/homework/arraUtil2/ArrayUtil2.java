package homework.arraUtil2;

public class ArrayUtil2 {

    void print(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }

    }

    int evens(int[] array) {

        int evens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens++;
            }
        }

        return evens;

    }

    int odds(int[] array) {
        int odds = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 > 0) {
                odds++;
            }
        }
        return odds;
    }


    int average(int[] array) {

        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        return average / array.length;


    }

    int total(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }

        return (total);
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }

        return (max);
    }


    int min(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return (min);

    }


    void twain(int[] array) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");

            }

        }

    }


    void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }

        }
    }


    void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {

                if (array[j] > array[j - 1]) {

                    int tmp = array[j];

                    array[j] = array[j - 1];

                    array[j - 1] = tmp;

                }
            }

        }


    }
}