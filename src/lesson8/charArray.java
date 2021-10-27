package lesson8;

public class charArray {

    public static void main(String[] args) {
        //                       0    1    2    3    4    5
        char[] charArray = {'b', 'o', 'l', 'o', 'l', 'a'};

//տպել բոլոր c փոփողականի ինդեքսները
        //     char c = 'o';
        //   for (int i = 0; i < charArray.length; i++) {
        //     if (charArray[i] == c) {
        //       System.out.println(i);
        // }
        //}


        //տպել c փոփոխականի քանակը;

        char c = 'o';
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                count++;
            }
        }
        System.out.println("count of" + c + "=" + count);


        //տպել մեջտեղի էլեմենտները

        System.out.println(charArray[charArray.length / 2]);
        System.out.println(charArray[charArray.length / 2 - 1]);

//տպել,եթե մասիվը վերջանում է l,իսկ նախավերջինը y տառերով

        //   if(charArray[charArray.length-2] =='l' && charArray[charArray.length-1]=='y'){
        //     System.out.println(true);
        //   }else{
        //         System.out.println(false);
        //       }
//կամ կարելի է հայտարարել boolean փոփոխական

        boolean b = false;

        if (charArray[charArray.length - 2] == 'l' && charArray[charArray.length - 1] == 'y') {
            b = true;
        }
        System.out.println(b);


        char[] array = {'b', 'a', 'b', 'o', 'l', 'a'};

        boolean isBob = false;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 'b' && array[i + 2] == 'b') {
                isBob = true;

                break;
            }
        }
        System.out.println(isBob);

        char[] text = {' ', ' ', ' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', ' '};

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
        System.out.println();
// տպել էլեմենտները փոքրից մեծ
        int[] array1 = {2, 5, 8, 3, 1, 6, 93, 44, 22, 11};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 1; j < array1.length-i; j++) {

                if (array1[j] > array1[j - 1]) {

                    int tmp = array1[j];

                    array1[j] = array1[j - 1];

                    array1[j - 1] = tmp;

                }
            }

        }
        for (int i = 0; i < array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }

    }
}
