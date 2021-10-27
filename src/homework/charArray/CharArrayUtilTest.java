package homework.charArray;

public class CharArrayUtilTest {

    public static void main(String[] args) {

        CharArrayUtil charArrayUtil = new CharArrayUtil();

        char[] charArray = {'b', 'o', 'l', 'o', 'l', 'y'};

        int count = charArrayUtil.count(charArray, 'b');
        System.out.println(count);

        charArrayUtil.printMiddleElements(charArray);


        boolean isEnds = charArrayUtil.isEnds(charArray, 'l', 'y');
        System.out.println(isEnds);


        boolean isBob1 = charArrayUtil.isBob(charArray, 'b');
        System.out.println(isBob1);


        char[] text = {' ', ' ', ' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a'};

     char[] result=charArrayUtil.trim(text);
        System.out.print(result);


    }

}
