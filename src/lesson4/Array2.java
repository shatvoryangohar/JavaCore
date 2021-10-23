package lesson4;

public class Array2 {

    public static void main(String[] args) {
        int array[] = new int[10];
        array[0] = 123;
        array[1] = 987;
        array[2] = 48;
        array[3] = 17;
        array[4] = 236;
        array[5] = 417;
        array[6] = 456;
        array[7] = 45;
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        int[] numbers = new int[10];


        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println(" ");
        int index = 0;
        for (int i = 10; i > 0; i--) {
            numbers[index++] = i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "");


        }
   
   
   
   
    }

}




