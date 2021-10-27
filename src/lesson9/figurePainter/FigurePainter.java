package lesson9.figurePainter;

public class FigurePainter {


    void figureOne(int count,char c) {


        for (int i = 0; i <count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c+" ");
            }
            System.out.println();

        }

    }

    void figureTwo() {

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }


    void figureThree() {

        System.out.println();
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    void figureFour() {


        for (int i = 4; i > 0; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    void figureFive() {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3; i > 0; i--) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }


}


