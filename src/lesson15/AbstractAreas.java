package lesson15;

public class AbstractAreas {
    public static void main(String[] args) {
        //  Figure1 f = new Figure1(10, 10); //теперь недопустимо

        Triangle1 t = new Triangle1(10, 8);
        Rectangle1 r = new Rectangle1(9, 5);

        Figure1 figRef;

        figRef = r;
        System.out.println("Плoщaдь равна " + figRef.area());

        figRef = t;
        System.out.println("Плoщaдь равна " + figRef.area());


    }
}
