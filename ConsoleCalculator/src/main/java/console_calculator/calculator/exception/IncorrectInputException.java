package console_calculator.calculator.exception;

public class IncorrectInputException extends ParseExpressionException{
    public IncorrectInputException(String message) {
        super(message);
    }
}
