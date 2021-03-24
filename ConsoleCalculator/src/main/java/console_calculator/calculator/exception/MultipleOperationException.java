package console_calculator.calculator.exception;

public class MultipleOperationException extends ParseExpressionException {
    public MultipleOperationException() {
        super("Too much operations error!");
    }
}
