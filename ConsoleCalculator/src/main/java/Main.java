import console_calculator.calculator.Calculator;
import console_calculator.calculator.CalculatorDouble;
import console_calculator.calculator.Parser.ExpressionParser;
import console_calculator.calculator.Parser.ParserExpression;
import console_calculator.calculator.exception.DivisionByZeroException;
import console_calculator.calculator.exception.MultipleOperationException;
import console_calculator.calculator.exception.ParseExpressionException;
import console_calculator.calculator.input_output.OutputResult;
import console_calculator.calculator.input_output.UserInput;

import java.util.List;


public class Main {


    public static void main(String[] args)  {

        OutputResult outputResult = new OutputResult();
        ParserExpression parser = new ExpressionParser();
        Calculator calculator = new CalculatorDouble();

        String input;

        while (true) {
            input = UserInput.userInput();
            if (UserInput.exit(input))
            {
                break;
            }
            else {
                double result;
                try {
                    List<String> inputList = parser.parsingOperation(input);
                    result = calculator.calculator(inputList);
                    outputResult.result(result);
                } catch (MultipleOperationException multipleOperationException) {
                    outputResult.result(multipleOperationException);
                } catch (ParseExpressionException e) {
                    outputResult.result(e);
                } catch (DivisionByZeroException divisionByZeroException) {
                    outputResult.result(divisionByZeroException);
                }
            }
        }
    }
}
