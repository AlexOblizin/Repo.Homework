package console_calculator.calculator.exception;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException(double a, double b) {
        super(a + "/" + b + " Incorrect! Division by zero!");
    }
}
