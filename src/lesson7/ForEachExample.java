package lesson7;

public class ForEachExample {

    public static void main(String[] args) {


        int[] numbers = {1, 3, 4, 5, 7, 8};

     for(int a:numbers){
         System.out.println(a);
     }

        int sum = 0;
        for (int a : numbers) {
            sum+=a;
        }
        System.out.println(sum);




        int x = 7;
        boolean isFound = false;

        for (int a : numbers) {
            if (a == x) {
                isFound = true;

                break;
            }
        }
        System.out.println(isFound);


    }
}
