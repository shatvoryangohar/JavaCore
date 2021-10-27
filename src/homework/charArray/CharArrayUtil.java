package homework.charArray;

public class CharArrayUtil {


    int count(char[] array, char c) {


        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                count++;
            }
        }
        return count;
    }


    void printMiddleElements(char[] array) {
        System.out.println(array[array.length / 2]);
        System.out.println(array[array.length / 2 - 1]);
    }


    boolean isEnds(char[] array, char ch1, char ch2) {
        boolean b = false;

        if (array[array.length - 2] == ch1 && array[array.length - 1] == ch2) {
            b = true;
        }

        return b;
    }


    boolean isBob(char[] array, char ch1) {

        boolean isBob1 = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 'b' && array[i + 2] == 'b') {
                isBob1 = true;
                break;
            }
        }

        return isBob1;

    }


    char[] trim(char[] text){
        int startIndex = 0;
        int endIndex = text.length - 1;

        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }

        while (endIndex > startIndex && text[endIndex] == ' ') {
            endIndex--;
        }

        char[] result = new char[(endIndex - startIndex) + 1];

        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }

   return result;


    }


}
