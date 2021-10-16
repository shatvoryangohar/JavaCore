package lesson6;

public class While {

    public static void main(String[] args) {

        int n = 10;
        while (n > 0) {

            System.out.println("такт" + n);
            n--;

        }

        int i = 100;
        int j = 200;
        while (++i < --j) {

        }
        System.out.println("среднее знаение равно" + i);

        int b = 10;

        do {
            System.out.println("такт" + b);
        }
        while (--b >0);
    }
}

