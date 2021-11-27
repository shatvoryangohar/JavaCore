package lesson15;

public class Triangle1 extends Figure1 {

    Triangle1(double a, double b) {
        super(a, b);
    }
// переопределить метод area() для
//прямоугольного треугольника

    double area() {
        System.out.println("B области треугольника.");
        return dim1 * dim2 / 2;
    }


}
