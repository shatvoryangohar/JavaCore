package lesson10;

public class Box {


    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }


    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }


    //   void volume() {
    //     System.out.print("Объем равен ");
    //   System.out.println(width * height * depth);
    //}

    double volume() {

        return width * height * depth;
    }

    //  void SetDim(double w, double h, double d) {
    //    width = w;
    //  height = h;
    //  depth = d;

//}
}
