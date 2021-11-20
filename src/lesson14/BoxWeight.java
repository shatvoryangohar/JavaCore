package lesson14;

//расширить класс Вох, включив в него поле веса
// Теперь в классе BoxWeight ключевое слово super используется для инициализации собственных
// свойств объекта типа Вох
public class BoxWeight extends Box {

    double weight;

//    BoxWeight(double w, double h, double d, double m) {
//        width = w;
//        height = h;
//        depth = d;
//        weight = m;
//    }
// инициализировать поля width, height и depth
// с помощью метода super()

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);//вызвать конструктор суперкласса
        weight = m;
    }

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

}
