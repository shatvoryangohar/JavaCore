package lesson9.arrayUtil;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] num = {3, 6, 8, 1, 3};

        int maxofnum = arrayUtil.max(num);


        int[] numbers = {25, 45, 32, 6, 7};
        int maxofnumbers = arrayUtil.max(numbers);


        if (maxofnum > maxofnumbers) {
            System.out.println("amenamec@ arajinum e" + maxofnum);
        } else {
            System.out.println("amenamec@ erkrordimej e" + maxofnumbers);
        }

        System.out.println("gumar@" + (maxofnum + maxofnumbers));

    }

}
