package lesson12;

public class AccessTest {
    public static void main(String[] args) {

        TestAccess ob = new TestAccess();

        ob.a = 10;
        ob.b = 20;
        ob.setC(100);

        System.out.println("a,b,c:" + ob.a + " " + ob.b + " " + ob.getC());


    }
}
