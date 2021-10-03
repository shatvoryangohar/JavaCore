package lesson2;

public class Example {

/*
int,if,for փոփոխականների մասին է
 */

    public static void main(String[] args) {

        int num;
        num = 10;
        System.out.println("num=" + num);

        num = num * 20;

        System.out.print("num=");
        System.out.println(num);

        if (num > 100) {
            System.out.println("num>100");
        }

        if (num < 100) {

            System.out.println("num<100");
            System.out.println("Java");
        }

        if (num == 200) {

            System.out.println(num == 100);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Java");
        }

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + "Java");
        }

        int x, y;
        y = 20;
        for (x = 0; x < 10; x++) {

            System.out.println("x=" + x);
            System.out.println("y=" + y);
            y = y - 2;
        }
int z;
    for(z=0;z<10;z++){

        System.out.println("z=" + z);
    }




    }


}
