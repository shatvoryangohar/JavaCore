package lesson9.arrayUtil;

public class ArrayUtil {

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }

        return (max);
    }
}
