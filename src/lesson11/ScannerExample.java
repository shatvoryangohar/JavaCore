package lesson11;

import calculator.Calculator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean isRun = true;
        while (isRun) {

            System.out.println("please input a");
            int a = scanner.nextInt();
            System.out.println("please input b");
            int b = scanner.nextInt();
            //     System.out.println("sum=" + (a+b));


            //ընդունել c String սինվոլը,որը կարող է լինել +,-,*/
// կախված սինվոլից կանչել Calculator կլասսի համապատասխան մեթոդը

            boolean isWrongOperation = false;
            do {

                isWrongOperation = false;

                System.out.println("please input operation(+,-,/,*)or 0 for exit");
                String c = scanner.next();

                switch (c) {

                    case "+":
                        System.out.println(calculator.gumarum(a, b));
                        break;

                    case "-":
                        System.out.println(calculator.hanum(a, b));
                        break;

                    case "/":
                        System.out.println(calculator.bajanum(a, b));
                        break;
                    case "*":
                        System.out.println(calculator.bazmapatkum(a, b));
                        break;
                    case "0":
                        isRun = false;
                        break;
                    default:
                        isWrongOperation = true;
                        System.out.println("invalid operation");
                }
            } while (isWrongOperation);
        }
    }
}