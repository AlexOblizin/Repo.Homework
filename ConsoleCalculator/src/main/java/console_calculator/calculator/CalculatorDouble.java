package console_calculator.calculator;

import console_calculator.calculator.exception.DivisionByZeroException;
import console_calculator.calculator.exception.IncorrectInputException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;

public class CalculatorDouble implements Calculator {

    @Override
    public double calculator(List<String> postfixList) throws IncorrectInputException, DivisionByZeroException {

        Deque<Double> stack = new ArrayDeque<>();

        for (String inp : postfixList) {
            try {

                if (inp.equals("+")) {

                    stack.push(stack.pop() + stack.pop());

                } else if (inp.equals("-")) {

                    Double b = stack.pop(), a = stack.pop();
                    stack.push(a - b);

                } else if (inp.equals("*")) {

                    stack.push(stack.pop() * stack.pop());

                } else if (inp.equals("/")) {

                    Double b = stack.pop(), a = stack.pop();

                    if (b == 0) {
                        throw new DivisionByZeroException(a, b);
                    }

                    stack.push(a / b);

                } else if (inp.equals("u-")) {

                    stack.push(-stack.pop());

                } else {

                    stack.push(Double.valueOf(inp));

                }

            } catch (NoSuchElementException ex) {

                throw new IncorrectInputException("Incorrect Input!");
            }
        }
        return stack.pop();
    }
}
