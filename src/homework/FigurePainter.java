package homework;

public class FigurePainter {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        int num = 5;
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = num; k > i; k--) {
                System.out.print("*");
            }
            System.out.println("");

        }

        int numbers = 4;
        for (int i = 0; i < numbers; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = numbers; k > i; k--) {
                System.out.print("*");
            }
            System.out.println("");

        }


    }


    }







