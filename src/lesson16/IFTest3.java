package lesson16;

public class IFTest3 {
    public static void main(String[] args) {

        IntStack myStack;
//создать переменную ссылки на интерфейс

        DynStack ds = new DynStack(5);
        FixedStack fx = new FixedStack(8);

        myStack = ds; //загрузить динамический стек
        for (int i = 0; i < 12; i++) {
            myStack.push(i);
        }
        // загрузить фиксированный стек 
        myStack = fx;
        for (int i = 0; i < 8; i++) {
            myStack.push(i);
        }

        myStack = ds;
        System.out.println("Знaчeния в динамическом стеке:");

        for (int i = 0; i < 12; i++) {
            System.out.println(myStack.рор());
        }
        myStack = fx;
        System.out.println("Знaчeния в фиксированном стеке:");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack.рор());
        }


    }
}
