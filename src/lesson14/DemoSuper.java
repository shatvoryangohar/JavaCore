package lesson14;

public class DemoSuper {
    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Oбъeм myBox1 равен " + vol);
        System.out.println("Вес myBox1 равен " + myBox1.weight);
        vol = myBox2.volume();
        System.out.println("Oбъeм myBox2 равен " + vol);
        System.out.println("Вес myBox2 равен " + myBox2.weight);
        vol = myBox3.volume();
        System.out.println("Oбъeм myBox3 равен " + vol);
        System.out.println("Вес myBox3 равен " + myBox3.weight);
        vol = myClone.volume();
        System.out.println("Oбъeм myClone равен " + vol);
        System.out.println("Вес myClone равен " + myClone.weight);
        vol = myCube.volume();
        System.out.println("Oбъeм myCube равен " + vol);
        System.out.println("Вес myCube равен " + myCube.weight);

    }
}
