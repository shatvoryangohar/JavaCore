package lesson15;

public class Dispatch {
    public static void main(String[] args) {

        A a = new A(); //Объект класса А
        B b = new B();//Объект класса B
        C c = new C();//Объект класса C

        A r;// получить ссылку на объект типа А

        r = a;// переменная r ссылается на объект типа А
        r.callMe();// вызвать вариант метода callMe(),определенный в классе А

        r = b;// переменная r ссылается на объект типа B
        r.callMe();// вызвать вариант метода callMe(),определенный в классе B

        r = c;// переменная r ссылается на объект типа А
        r.callMe();// вызвать вариант метода callMe(),определенный в классе C

    }
}