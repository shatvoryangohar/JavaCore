package lesson14;
// добавить поле стоимости доставки

public class Shipment extends BoxWeight {

    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {

    }

    Shipment(double len, double w, double c) {
        super(len, w);
        cost = c;
    }


}
