package lesson15;

// Применение абстрактных методов и классов
public abstract class Figure1 {

    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
// теперь метод area() объявляется абстрактным

    abstract double area();



}
