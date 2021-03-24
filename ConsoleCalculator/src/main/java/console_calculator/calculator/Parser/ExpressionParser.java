package console_calculator.calculator.Parser;

import console_calculator.calculator.exception.*;

import java.util.*;

public class ExpressionParser implements ParserExpression {

    // при необходимости можно добавить функции, как в условиях задания
    // после этого останется добавить небольшой код (на каждую добавленную функцию)
    // в двух методах по парсингу и вычислению результата
    private final static String[] func = new String[]{"sqrt", "^", "cube"};

    private static String operator = "+-*/";
    private static String delimiter = "() " + operator;

    private static boolean isDelimiter(String token) {
        if (token.length() != 1) {
            return false;
        }
        for (int i = 0; i < delimiter.length(); i++) {
            if (token.charAt(0) == delimiter.charAt(i)) {
                return true;
            }
        }
        return false;
    }


    private static boolean isOperator(String token) {
        if (token.equals("u-")) {
            return true;
        }
        for (int i = 0; i < operator.length(); i++) {
            if (token.charAt(0) == operator.charAt(i)) {
                return true;
            }
        }
        return false;
    }


    private static boolean isFunction(String token) {
        for (String s : func) {
            if (s.equals(token)) {
                return true;
            }
        }
        return false;
    }

    private static int priority(String token) {
        if (token.equals("(")) {
            return 1;
        }
        if (token.equals("+") || token.equals("-")) {
            return 2;
        }
        if (token.equals("*") || token.equals("/")) {
            return 3;
        }
        return 4;
    }


    public List<String> parsingOperation(String inputString) throws ParseExpressionException {
        List<String> postfix = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();
        StringTokenizer tokenizer = new StringTokenizer(inputString, delimiter, true);
        String previous = "";
        String current = "";
        while (tokenizer.hasMoreTokens()) {
            current = tokenizer.nextToken();
            if (isOperator(current) && previous.length() > 0 && isOperator(previous)) {
                throw new MultipleOperationException();
            }
            if (!tokenizer.hasMoreTokens() && isOperator(current)) {
                throw new IncorrectInputException("Incorrect Input");
            }
            if (current.equals(" ")) {
                continue;
            }
            if (isFunction(current)) {
                stack.push(current);
            } else if (isDelimiter(current)) {
                if (current.equals("(")) {
                    stack.push(current);
                } else if (current.equals(")")) {
                    if (stack.isEmpty()) {
                        throw new BracketsNumberException("Brackets are not agreed");
                    }
                    while (!stack.peek().equals("(")) {
                        postfix.add(stack.pop());
                        if (stack.isEmpty()) {
                            throw new BracketsNumberException("Brackets are not agreed");
                        }
                    }
                    stack.pop();
                    if (!stack.isEmpty() && isFunction(stack.peek())) {
                        postfix.add(stack.pop());
                    }
                } else {
                    if (current.equals("-") && (previous.equals("")
                            || (isDelimiter(previous) && !previous.equals(")")))) {
                        current = "u-";
                    } else {
                        while (!stack.isEmpty() && (priority(current) <= priority(stack.peek()))) {
                            postfix.add(stack.pop());
                        }

                    }
                    stack.push(current);
                }

            } else {

                if (!validOperand(current)) {
                    throw new NotANumberException(current);
                }
                postfix.add(current);
            }
            previous = current;
        }

        while (!stack.isEmpty()) {
            if (isOperator(stack.peek())) postfix.add(stack.pop());
            else {
                throw new BracketsNumberException("Brackets are not agreed");
            }
        }
        return postfix;
    }

    @Override
    public boolean validOperand(String obj) {
        try {
            Double.parseDouble(obj);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}