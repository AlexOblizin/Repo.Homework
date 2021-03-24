package console_calculator.calculator.Parser;

import console_calculator.calculator.exception.ParseExpressionException;

import java.util.List;

public interface ParserExpression {
    List<String> parsingOperation(String infix) throws ParseExpressionException;
    boolean validOperand(String obj);
}
