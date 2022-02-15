package academy.mindswap;

public class Calculator {

    @FunctionalInterface
    interface MathOperation {
        double calculate (double a, double b);
    }

    @FunctionalInterface
    interface StringOperation {
       String concatName (String a, String b);
    }


    public double operate(double a, double b, MathOperation operation) {
        return operation.calculate(a,b);
    }

    public static void main(String[] args) {
	// write your code here

        MathOperation addition = (a,b) -> a + b;
        MathOperation subtraction = (a,b) -> a - b;
        MathOperation multiplication = (a,b) -> a * b;
        MathOperation divide = (a,b) -> a / b;


        Calculator calc = new Calculator();

        System.out.println(calc.operate(2, 3, addition));
        System.out.println(calc.operate(2, 3, subtraction));
        System.out.println(calc.operate(4, 2, (a,b) -> a / b));


        StringOperation concatString = (a,b) -> a+b;

        System.out.println(concatString.concatName("Hello", "world"));


    }
}
