package lesson15;

public class FindsAreas {
    public static void main(String[] args) {

        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figRef;

        figRef = r;
        System.out.println("Плoщaдь равна " + figRef.area());

        figRef = t;
        System.out.println("Плoщaдь равна " + figRef.area());

        figRef = f;
        System.out.println("Плoщaдь равна " + figRef.area());


    }
}
