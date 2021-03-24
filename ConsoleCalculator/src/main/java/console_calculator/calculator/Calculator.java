package console_calculator.calculator;

import console_calculator.calculator.exception.DivisionByZeroException;
import console_calculator.calculator.exception.IncorrectInputException;

import java.util.List;

public interface Calculator {
    double calculator(List<String> postfixList) throws DivisionByZeroException, IncorrectInputException;
}
