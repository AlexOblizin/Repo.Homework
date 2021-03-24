package console_calculator.calculator.exception;

public class NotANumberException extends ParseExpressionException {

    public NotANumberException(String message) {
        super("This is not a number " + message);
    }
}
