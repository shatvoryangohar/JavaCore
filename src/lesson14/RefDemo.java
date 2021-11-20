package lesson14;

public class RefDemo {
    public static void main(String[] args) {

        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Oбъeм weightBox равен " + vol);
        System.out.println("Bec weightBox равен " + weightBox.weight);
        System.out.println();
        // присвоить переменной ссылки на объект типа BoxWeight
        // ссылку на объект типа Вох

        plainBox = weightBox;
        vol = plainBox.volume();//Верно, так как метод volume() определен в классе Вох
        System.out.println("Oбъeм plainBox равен ");


    }
}
