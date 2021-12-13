package lesson17;

public class Exc2 {

    public static void main(String[] args) {

        int d, a;

        try {   //проконтролировать блок кода

            d = 0;
            a = 42 / d;
            System.out.println("Этo не будет выведено.");
        } catch (ArithmeticException e) {
//перехватить ошибку деления на нуль
            System.out.println("Дeлeниe на нуль.");
        }
        System.out.println("Пocлe оператора catch.");

    }
}
