package lesson12;

public class RetOb {
    public static void main(String[] args) {

        Test4 ob1 = new Test4(2);
        Test4 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеле4ения зна4ения: " + ob2.a);

    }
}
