package lesson12;

public class OverLoad {

    public static void main(String[] args) {

        OverloadDemo ob = new OverloadDemo();
        //  double result;
        int i = 88;


        ob.test();
        //   ob.test(10);
        ob.test(10, 20);
//        result = ob.test(123.25);
//        System.out.println("Результат вызова ob.test(123.25):" + result);
        ob.test(i);
        ob.test(123.2);


    }
}
