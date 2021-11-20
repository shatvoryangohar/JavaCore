package lesson14;

public class SimpleInheritance {
    public static void main(String[] args) {


        A superOb = new A();
        B subOb = new B();

// суперкласс может использоваться самостоятельно

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Coдepжимoe объекта superOb: ");

        superOb.showIJ();
        System.out.println();

    /* Подкласс имеет доступ ко всем открытым членам
своего суперкласса. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Coдepжимoe объекта subOb: ");
        subOb.showIJ();
        subOb.showK();
        System.out.println();
        System.out.println("Cyммa i, и k в объекте subOb:");
        subOb.sum();
    }
}
