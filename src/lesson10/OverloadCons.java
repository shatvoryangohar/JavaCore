package lesson10;

public class OverloadCons {

    public static void main(String[] args) {

        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double vol;

        vol = myBox1.volume();
        System.out.println("объем myBox1 равен: " + vol);

        vol = myBox2.volume();
        System.out.println("объем myBox2 равен: " + vol);

        vol = myCube.volume();
        System.out.println("объем myCube равен: " + vol);
    }
}
