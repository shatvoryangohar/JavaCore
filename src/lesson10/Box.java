package lesson10;

public class Box {


    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
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
