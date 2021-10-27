package homework.arrayutil;

public class ArrayExample {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        // l   y
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                count++;
            }
        }
        System.out.println("char c=" + count);

        int index = bolola.length / 2 - 1;
        int index2 = bolola.length / 2;
        char ch1 = bolola[index];
        char ch2 = bolola[index2];


        System.out.println(ch1);
        System.out.println(ch2);


        int length = bolola.length;
        boolean isFounder = false;
        char last = bolola[length - 1]; // l y
        char before = bolola[length - 2];
        if (last == 'y' && before == 'l') {
            isFounder = true;
        }
        System.out.println(isFounder);
        //  i, i+1, i+2
        char[] bolola1 = {'b', 'a', 'b', 'o', 'l', 'a'}; // b o b

        for (int i = 0; i < bolola1.length - 2; i++) {
            char ch3 = bolola1[i];
            char ch4 = bolola1[i + 2];

            if (ch3 == 'b' && ch4 == 'b') {
                System.out.println("Found:" + true);
            }

        }

        char[] text = {' ', ' ', 'b', 'a', ' ', 'r', 'e', 'v', ' ', ' '};
        //            "","", "",""
        char[] result = new char[text.length];

        int index3 = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                result[index3] = text[i];
                index3++;
            }
        }
        System.out.println(result);
        }



    }

