package calculator;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();


        int result = calculator.gumarum(34, 10);

        System.out.println(result);


        result = calculator.hanum(45, 10);

        System.out.println(result);


        result = calculator.bajanum(20, 10);

        System.out.println(result);


        result = calculator.bazmapatkum(20, 40);

        System.out.println(result);


    }


}
